package com.atividade.perfumaria.model;

public class Produto {
	private int id;
	private int preco;
	
	
	public Produto(int id, int preco) {
		super();
		this.id = id;
		this.preco = preco;
	}
	
	public Produto() {
		super();
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}
	
	
}
