package com.contabilidad.app.models.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.contabilidad.app.models.entity.Prenda;
import com.contabilidad.app.models.entity.Tienda;


public interface IPrendaDao extends CrudRepository<Prenda, Integer>{
	public List<Prenda> findIsLikeNombreOrderByNombre(String nombre);
	public List<Prenda> findIsLikeNombreOrderByNombre(Integer prenda);
}
