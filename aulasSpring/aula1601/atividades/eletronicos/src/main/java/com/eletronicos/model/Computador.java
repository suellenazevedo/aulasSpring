package com.eletronicos.model;

public class Computador {
	
	private String marca;
	private String modelo;
	
	
	public Computador(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
	

}
