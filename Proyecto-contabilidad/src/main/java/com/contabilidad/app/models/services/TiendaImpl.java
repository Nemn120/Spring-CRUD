package com.contabilidad.app.models.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.contabilidad.app.models.dao.IPrendaDao;
import com.contabilidad.app.models.dao.ITiendaDao;
import com.contabilidad.app.models.entity.Prenda;
import com.contabilidad.app.models.entity.Tienda;
@Service
public class TiendaImpl implements ITiendaService{
	
	@Autowired
	private ITiendaDao tiendaDao;
	
	@Autowired
	private IPrendaDao prendaDao;

	@Override
	@Transactional
	public List<Tienda> findAll() {
		return (List<Tienda>) tiendaDao.findAll();
	}


	@Override
	@Transactional
	public void save(Tienda tienda) {
		tiendaDao.save(tienda);
		
	}

	@Override
	@Transactional
	public Tienda findOne(Integer id) {
		return tiendaDao.findById(id).orElse(null);
	}


	@Override
	@Transactional
	public List<Tienda> findByNombre(String nombre) {
		return tiendaDao.findIsLikeNombreOrderByNombre(nombre);
	}


	@Override
	@Transactional
	public void delete(Integer id) {
		tiendaDao.deleteById(id);
		
	}


	@Override
	@Transactional
	public void savePrenda(Prenda prenda) {
		prendaDao.save(prenda);
		
	}
	

}
