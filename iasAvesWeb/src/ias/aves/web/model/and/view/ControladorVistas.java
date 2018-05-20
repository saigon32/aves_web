package ias.aves.web.model.and.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControladorVistas {
	@RequestMapping("/administracionAves")
	public ModelAndView administracionAves() {
		return new ModelAndView("administracionAves");
	}

	@RequestMapping("/consultaAves")
	public ModelAndView consultaAves() {
		return new ModelAndView("consultaAves");
	}

	@RequestMapping("/consultaAvesZona")
	public ModelAndView consultaAvesZona() {
		return new ModelAndView("consultaAvesZona");
	}

}
