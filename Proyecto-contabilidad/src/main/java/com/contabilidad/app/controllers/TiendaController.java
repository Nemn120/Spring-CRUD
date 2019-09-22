package com.contabilidad.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.contabilidad.app.models.entity.Tienda;
import com.contabilidad.app.models.services.IPrendaService;
import com.contabilidad.app.models.services.ITiendaService;

@Controller
@SessionAttributes("tienda")
@RequestMapping("/tienda")
public class TiendaController {
	
	Integer idTienda;
	@Autowired
	ITiendaService tiendaService;
	
	@Autowired
	IPrendaService prendaService;
	
	@GetMapping("/form")
	public String crear(Model model) {
		Tienda tienda = new Tienda();
		model.addAttribute("titulo","Agregar Tienda a GamarraBeat");
		model.addAttribute("tienda",tienda);
		return "tienda/form";
	}
	@PostMapping("/form")
	public String guardar(Tienda tienda,Model model) {
		//model.addAttribute("tienda","Agregar Tienda a GamarraBeat");
		tiendaService.save(tienda);
		return "redirect:/tienda/listar";
	}
	
	@GetMapping("/listar")
	public String listar(Model model) {
		model.addAttribute("titulo", "Listado de tiendas Gamarra");
		model.addAttribute("tiendas",tiendaService.findAll());
		return "tienda/listar";
	}
	@GetMapping("/ver/{id}")
	public String verTienda(@PathVariable(value="id") Integer id,Model model) {
		model.addAttribute("tienda",tiendaService.findOne(id));
		idTienda=id;
		return "tienda/ver";
	}
	@GetMapping("/buscar")
	public String buscarTienda(Model model) {
		String nombre=null;
		model.addAttribute("titulo","Buscar tienda en GammarraBeat");
		model.addAttribute("nombre",nombre);
		return "tienda/buscar";
	}
	@PostMapping("/buscar")
	public String buscarTiendap(String nombre,Model model) {
		List<Tienda> tiendas=tiendaService.findByNombre(nombre);
		
		model.addAttribute("tiendas",tiendas);
		model.addAttribute("titulo","Tiendas con el nombre: "+nombre);
		return "tienda/buscar";
	}

	@GetMapping("/eliminar/{id}")
	public String eliminar(@PathVariable(value="id")Integer id, Model model) {
		prendaService.delete(id);
		
		return "redirect:/tienda/listar";
	}
	
	
	
	
	
	

}
