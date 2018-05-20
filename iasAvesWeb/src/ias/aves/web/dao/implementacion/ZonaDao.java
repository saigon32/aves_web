package ias.aves.web.dao.implementacion;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ias.aves.web.dao.IZonaDao;
import ias.aves.web.modelo.TontAvesPai;
import ias.aves.web.modelo.TontZona;

@Repository
@Transactional
public class ZonaDao implements IZonaDao {

	@PersistenceContext
	EntityManager entityManager;

	@Override
	public void ingresarZona(TontZona zona) {
		this.entityManager.persist(zona);
	}

	@Override
	public void actualizarZona(TontZona zona) {
		this.entityManager.merge(zona);

	}

	@Override
	public void eliminarZona(String cdzona) {
		TontZona zona = this.find(cdzona);
		this.entityManager.remove(zona);
	}

	public TontZona find(String cdzona) {
		return this.entityManager.find(TontZona.class, cdzona);
	}

	@SuppressWarnings("unchecked")
	public List<TontAvesPai> listarAvesZona(String dsnombre) {
		List<TontAvesPai> listaAvesZona = null;
		try {
			StringBuilder hql = new StringBuilder();
			hql.append("from TontAvesPai as p where p.tontPais.tontZona.cdzona like :dsnombre or p.tontPais.tontZona.dsnombre like :dsnombre");
			Query query = entityManager.createQuery(hql.toString());
			query.setParameter("dsnombre", "%" + dsnombre + "%");
			listaAvesZona = (List<TontAvesPai>) query.getResultList();
		} catch (Exception exception) {
			throw exception;
		}
		return listaAvesZona;
	}

}
