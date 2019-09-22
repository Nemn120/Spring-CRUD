package com.contabilidad.app.models.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.contabilidad.app.models.entity.Prenda;
import com.contabilidad.app.models.entity.Tienda;




public interface ITiendaDao extends CrudRepository<Tienda, Integer>{
	public List<Tienda> findIsLikeNombreOrderByNombre(String nombre);

}
