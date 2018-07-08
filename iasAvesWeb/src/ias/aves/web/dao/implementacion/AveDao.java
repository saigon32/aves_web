package ias.aves.web.dao.implementacion;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ias.aves.web.dao.IAveDao;
import ias.aves.web.modelo.TontAve;

@Repository
@Transactional
public class AveDao implements IAveDao {

	@PersistenceContext
	EntityManager entityManager;

	@Override
	public void ingresarAve(TontAve ave) {
		this.entityManager.persist(ave);
	}

	@Override
	public void actualizarAve(TontAve ave) {
		this.entityManager.merge(ave);

	}

	@Override
	public void eliminarAve(String cdave) {
		TontAve ave = this.find(cdave);
		this.entityManager.remove(ave);
	}

	public TontAve find(String cdave) {
		return this.entityManager.find(TontAve.class, cdave);
	}

	@Override
	public TontAve obtenerAve(String cdave) {
		Query query = entityManager.createNamedQuery("TontAve.findByCdave");
		TontAve ave = (TontAve) query.setParameter("cdave", cdave).getResultList().get(0);
		return ave;
	}

	@SuppressWarnings("unchecked")
	public List<TontAve> listarAves() {
		Query query = entityManager.createQuery("from TontAve");
		List<TontAve> listaAves = (List<TontAve>) query.getResultList();
		return listaAves;
	}

	@SuppressWarnings("unchecked")
	public List<TontAve> listarAvesNombre(String dsnombreComun, String dsnombreCientifico) {
		List<TontAve> listaAves = null;
		try {
			StringBuilder hql = new StringBuilder();
			hql.append("from TontAve as a where a.dsnombreComun like :dsnombreComun or a.dsnombreCientifico like :dsnombreCientifico");
			Query query = entityManager.createQuery(hql.toString());
			query.setParameter("dsnombreComun", "%" + dsnombreComun + "%");
			query.setParameter("dsnombreCientifico", "%" + dsnombreCientifico + "%");
			listaAves = (List<TontAve>) query.getResultList();
		} catch (Exception exception) {
			System.err.println("Error en metodo listarAvesNombre: " + exception.getLocalizedMessage());
			throw exception;
		}
		return listaAves;
	}

}
