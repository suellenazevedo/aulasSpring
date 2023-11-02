package com.generation.alunosapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.alunosapi.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
