package com.contabilidad.app.models.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.contabilidad.app.models.services.TiendaImpl;

import javax.persistence.JoinColumn;
@Entity
@Table(name="TIENDAS")
public class Tienda implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="TIENDA_ID")
	private Integer id;
	private String nombre;
	private String direccion;
	private String contacto;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	//(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	//@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	//@JoinTable(name="TIENDA_PRENDA", joinColumns = @JoinColumn(name="TIENDA_ID"),
	//inverseJoinColumns= @JoinColumn(name="PRENDA_ID"))
	@OneToMany(mappedBy="tienda", cascade= {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Prenda> prendas =new ArrayList<Prenda>();
	
	public Tienda() {
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getContacto() {
		return contacto;
	}
	public void setContacto(String contacto) {
		this.contacto = contacto;
	}
	public List<Prenda> getPrendas() {
		return prendas;
	}
	public void setPrendas(List<Prenda> prendas) {
		this.prendas = prendas;
	}

	
	
	
	

}
