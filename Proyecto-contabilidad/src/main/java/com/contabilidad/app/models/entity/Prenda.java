package com.contabilidad.app.models.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="PRENDAS")
public class Prenda implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="PRENDA_ID")
	private Integer id;
	private String nombre;
	private Double precio;
	private Integer prenda;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="TIENDA_ID")
	private Tienda tienda;
	
	public Integer getPrenda() {
		return prenda;
	}

	public void setPrenda(Integer prenda) {
		this.prenda = prenda;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Tienda getTienda() {
		return tienda;
	}

	public void setTienda(Tienda tienda) {
		this.tienda = tienda;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	

}
