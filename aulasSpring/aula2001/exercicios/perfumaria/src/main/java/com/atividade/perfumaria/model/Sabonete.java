package com.atividade.perfumaria.model;

public class Sabonete extends Produto {
	private String marca;
	private boolean liquido;
	
	
	public Sabonete(int id, int preco, String marca, boolean liquido) {
		super(id, preco);
		this.marca = marca;
		this.liquido = liquido;
	}
	
	public Sabonete() {
		super();
	}
		

	

	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public boolean isLiquido() {
		return liquido;
	}


	public void setLiquido(boolean liquido) {
		this.liquido = liquido;
	}
	
	
}
