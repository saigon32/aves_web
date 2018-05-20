package ias.aves.web.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ias.aves.web.dao.IAveDao;
import ias.aves.web.dao.IZonaDao;
import ias.aves.web.modelo.TontAve;
import ias.aves.web.modelo.TontAvesPai;

@RestController
@RequestMapping("/AvesServicio")
public class AvesServicio {

	@Autowired
	IAveDao aveDao;

	@Autowired
	IZonaDao zonaDao;

	@RequestMapping(value = "/listarAves", method = RequestMethod.GET, produces = "application/json")
	public List<TontAve> listarAves() {
		return aveDao.listarAves();
	}

	@RequestMapping(value = "/listarAvesNombre", method = RequestMethod.GET, produces = "application/json")
	public List<TontAve> listarAvesNombre(@RequestParam(value = "dsnombreComun", required = true) String dsnombreComun, @RequestParam(value = "dsnombreCientifico", required = true) String dsnombreCientifico) {
		return aveDao.listarAvesNombre(dsnombreComun, dsnombreCientifico);
	}

	@RequestMapping(value = "/listarAvesZona", method = RequestMethod.GET, produces = "application/json")
	public List<TontAvesPai> listarAvesZona(@RequestParam(value = "dsnombre", required = true) String dsnombre) {
		return zonaDao.listarAvesZona(dsnombre);
	}

//	@Transactional
	@RequestMapping(value = "/ingresarAve", method = RequestMethod.GET)
	public void ingresarAve(@RequestParam(value = "cdave", required = true) String cdave, @RequestParam(value = "dsnombreComun", required = true) String dsnombreComun, @RequestParam(value = "dsnombreCientifico", required = true) String dsnombreCientifico) throws Exception {
		TontAve tontAve = new TontAve();
		tontAve.setCdave(cdave);
		tontAve.setDsnombreComun(dsnombreComun);
		tontAve.setDsnombreCientifico(dsnombreCientifico);
		aveDao.ingresarAve(tontAve);
	}

	@Transactional
	@RequestMapping(value = "/actualizarAve", method = RequestMethod.POST)
	public void actualizarAve(@RequestParam(value = "cdave", required = true) String cdave, @RequestParam(value = "dsnombreComun", required = true) String dsnombreComun, @RequestParam(value = "dsnombreCientifico", required = true) String dsnombreCientifico) throws Exception {
		TontAve tontAve = new TontAve();
		tontAve.setCdave(cdave);
		tontAve.setDsnombreComun(dsnombreComun);
		tontAve.setDsnombreCientifico(dsnombreCientifico);
		aveDao.actualizarAve(tontAve);
	}

	@Transactional
	@RequestMapping(value = "/eliminarAve", method = RequestMethod.POST)
	public void eliminarAve(@RequestParam(value = "cdave", required = true) String cdave) throws Exception {
		aveDao.eliminarAve(cdave);
	}

}
