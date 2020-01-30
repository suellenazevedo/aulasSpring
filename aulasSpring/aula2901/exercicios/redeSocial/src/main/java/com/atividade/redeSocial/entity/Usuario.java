package com.atividade.redeSocial.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(length = 101)
	@Size(max = 101, message = "atingiu o número máximo de caracteres")
	@NotEmpty(message = "Preencha o campo")
	private String nome;
	
	@Column(length = 101)
	@Size(max = 101, message = "atingiu o número máximo de caracteres")
	@NotEmpty(message = "Preencha o campo")
	private String email;
	
	@Column(length = 13)
	@Size(max = 13, message = "atingiu o número máximo de caracteres")
	@NotEmpty(message = "Preencha o campo")
	private String senha;
	
	
	@ManyToOne
	private Estado estado; 
	

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
