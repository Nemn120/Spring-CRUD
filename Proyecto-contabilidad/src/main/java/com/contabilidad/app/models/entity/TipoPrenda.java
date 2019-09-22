package com.contabilidad.app.models.entity;

public enum TipoPrenda {
	
	POLO ("Polo"),
	CASACA ("Casaca"),
	CHAQUETA ("Chaqueta"),
	CAMISA ("Camisa"),
	PANTALON ("Pantalon"),
	ZAPATOS ("Zapatos"),
	TERNOS ("Ternos");
	
	
	private final String name;
	
	TipoPrenda(String name) {
		this.name = name;
		
	}
	public String getName() {
		return name;
	}
	
	
	
}
