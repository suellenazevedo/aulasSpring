package com.atividade.redeSocial.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Estado {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id;
	private String estado;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
	
}
