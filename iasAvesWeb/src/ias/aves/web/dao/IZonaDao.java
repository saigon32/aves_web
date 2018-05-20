package ias.aves.web.dao;

import java.util.List;

import ias.aves.web.modelo.TontAvesPai;
import ias.aves.web.modelo.TontZona;

public interface IZonaDao {

	public void ingresarZona(TontZona zona);

	public void actualizarZona(TontZona zona);

	public void eliminarZona(String cdzona);

	public TontZona find(String cdzona);

	public List<TontAvesPai> listarAvesZona(String dsnombre);

}
