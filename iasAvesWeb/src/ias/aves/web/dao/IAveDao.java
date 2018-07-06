package ias.aves.web.dao;

import java.util.List;

import ias.aves.web.modelo.TontAve;
/**
 * 
 * 
 * @author User:Andres Jurado, 5 Julio 2018.
 *
 */
public interface IAveDao {

	public void ingresarAve(TontAve ave);

	public void actualizarAve(TontAve ave);

	public void eliminarAve(String cdave);

	public TontAve obtenerAve(String cdave);

	public List<TontAve> listarAves();

	public List<TontAve> listarAvesNombre(String dsnombreComun, String dsnombreCientifico);

}
