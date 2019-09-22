package com.contabilidad.app.models.services;

import java.util.List;


import com.contabilidad.app.models.entity.Prenda;
import com.contabilidad.app.models.entity.Tienda;


public interface IPrendaService {
	public List<Prenda> findAll();


	public void save(Prenda Prenda);

	public Prenda findOne(Integer id);

	public void delete(Integer id);

	public List<Prenda> findByNombre(String term);
}
