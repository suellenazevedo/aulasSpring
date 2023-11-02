package com.generation.alunosapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;


@Entity
@Table(name = "tb_aluno")
public class Aluno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O nome não pode estar vazio!")
	private String nome;
	
	private int idade;
	
	@NotBlank(message = "O nome do professor não pode estar vazio!")
	private String nomeProf;
	
	private int numSala;
	
	private double notaPrimSem;
	
	private double notaSegSem;
	
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNomeProf() {
		return nomeProf;
	}

	public void setNomeProf(String nomeProf) {
		this.nomeProf = nomeProf;
	}

	public int getNumSala() {
		return numSala;
	}

	public void setNumSala(int numSala) {
		this.numSala = numSala;
	}

	public double getNotaPrimSem() {
		return notaPrimSem;
	}

	public void setNotaPrimSem(double notaPrimSem) {
		this.notaPrimSem = notaPrimSem;
	}

	public double getNotaSegSem() {
		return notaSegSem;
	}

	public void setNotaSegSem(double notaSegSem) {
		this.notaSegSem = notaSegSem;
	}
	
}
