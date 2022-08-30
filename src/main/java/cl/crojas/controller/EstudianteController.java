package cl.crojas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cl.crojas.service.CursoService;
import cl.crojas.service.EstudianteService;
import cl.crojas.service.RegionService;

@Controller
@RequestMapping("/")
public class EstudianteController {
	
	@Autowired
	private EstudianteService estudianteService;
	
	@Autowired
	private RegionService regionService;
	
	@Autowired
	private CursoService cursoService;
	
	ModelAndView modelAndView = new ModelAndView("estudiantes");
	
	@GetMapping
	public ModelAndView estudiantes() {
		
		modelAndView.addObject("estudiantes", estudianteService.findAll());
		modelAndView.addObject("regiones", regionService.findAll());
		modelAndView.addObject("cursos", cursoService.findAll());
		return modelAndView;
	}
	
	@PostMapping("/filtrar")
	public ModelAndView filtrar(Model model, @RequestParam("region") String region, @RequestParam("curso") String curso) {
		modelAndView.addObject("estudiantes", estudianteService.findByRegionCurso(region,curso));
		modelAndView.addObject("regiones", regionService.findAll());
		modelAndView.addObject("cursos", cursoService.findAll());
		return modelAndView;
	}
	

}
