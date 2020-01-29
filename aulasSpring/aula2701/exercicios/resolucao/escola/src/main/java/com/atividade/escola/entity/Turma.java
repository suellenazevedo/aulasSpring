package com.atividade.escola.entity;
import javax.persistence.*;


@Entity
public class Turma {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTurma;
	private String nome;
	private String descricao;
	private int idTurno;
	
	
	public int getIdTurma() {
		return idTurma;
	}
	
	public void setIdTurma(int idTurma) {
		this.idTurma = idTurma;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public int getIdTurno() {
		return idTurno;
	}
	
	public void setIdTurno(int idTurno) {
		this.idTurno = idTurno;
	}
	
	
}
