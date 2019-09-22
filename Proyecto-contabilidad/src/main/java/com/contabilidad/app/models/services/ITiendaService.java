package com.contabilidad.app.models.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.contabilidad.app.models.dao.ITiendaDao;
import com.contabilidad.app.models.entity.Prenda;
import com.contabilidad.app.models.entity.Tienda;

public interface ITiendaService{
	public List<Tienda> findAll();


	public void save(Tienda cliente);

	public Tienda findOne(Integer id);

	public void delete(Integer id);

	public List<Tienda> findByNombre(String term);
	
	public void savePrenda(Prenda prenda);
	
}
