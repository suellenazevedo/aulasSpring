package com.atividade.escola.entity;
import javax.persistence.*;


@Entity
public class Aluno {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAluno;
	private String nome;
	private int idTurma;
	
	
	
	public int getId() {
		return idAluno;
	}
	
	public void setId(int id) {
		this.idAluno = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdTurma() {
		return idTurma;
	}
	
	public void setIdTurma(int idTurma) {
		this.idTurma = idTurma;
	}
	
	
	
}
