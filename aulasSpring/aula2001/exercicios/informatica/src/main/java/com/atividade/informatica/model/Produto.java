package com.atividade.informatica.model;

public class Produto {
	
	private int id;
	private int preco;
	private String nome;
	
	
	public Produto(int id, int preco, String nome) {
		super();
		this.id = id;
		this.preco = preco;
		this.nome = nome;
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
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
