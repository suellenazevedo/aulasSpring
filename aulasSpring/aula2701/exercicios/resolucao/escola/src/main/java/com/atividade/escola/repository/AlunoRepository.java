package com.atividade.escola.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.atividade.escola.entity.Aluno;


public interface AlunoRepository  extends CrudRepository<Aluno, Integer>{
	
	/*
	 * List<Aluno> findAllByNome(String nome);
	 * 
	 * Aluno findAlunoByNome(String nome);
	 * 
	 * List<Aluno> findAllByNomeAndTurma(String nome, int idTurma);
	 */
}
