package com.contabilidad.app.models.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contabilidad.app.models.dao.IPrendaDao;
import com.contabilidad.app.models.entity.Prenda;
import com.contabilidad.app.models.entity.Tienda;
@Service
public class PrendaImpl implements IPrendaService{
	
	@Autowired
	private IPrendaDao prendaDao;

	@Override
	@Transactional
	public List<Prenda> findAll() {
		// TODO Auto-generated method stub
		return (List<Prenda>) prendaDao.findAll();
	}

	@Override
	@Transactional
	public void save(Prenda prenda) {
		prendaDao.save(prenda);
		
	}

	@Override
	@Transactional
	public Prenda findOne(Integer id) {
		return prendaDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Integer id) {
		prendaDao.deleteById(id);
		
	}

	@Override
	public List<Prenda> findByNombre(String term) {
		return prendaDao.findIsLikeNombreOrderByNombre(term);
	}
	

}
