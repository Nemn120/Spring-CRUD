package com.contabilidad.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.contabilidad.app.models.entity.Prenda;
import com.contabilidad.app.models.entity.TipoPrenda;
import com.contabilidad.app.models.services.ITiendaService;

@Controller
@SessionAttributes("tienda")
@RequestMapping("/prenda")
public class PrendaController {
	
	Integer idTienda;

	
	@Autowired
	ITiendaService tiendaService;
	
	
	@GetMapping("/agregar/{id}")
	public String agregarPrenda(@PathVariable(value="id") Integer id,Model model) {
		Prenda prenda = new Prenda();
		model.addAttribute("titulo","Agregar Prenda");
		model.addAttribute("prenda",prenda);
		idTienda=id;
		return "prenda/agregar";
	}
	@PostMapping("/agregar")
	public String agregarPrenda(Prenda prenda,Model model) {
	
			prenda.setTienda(tiendaService.findOne(idTienda));
			tiendaService.savePrenda(prenda);
		
		return "redirect:/tienda/listar";
	}
	
}
