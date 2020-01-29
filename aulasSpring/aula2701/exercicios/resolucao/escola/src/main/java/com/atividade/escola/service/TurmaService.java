package com.atividade.escola.service;

import java.util.List;

import com.atividade.escola.entity.Turma;


public interface TurmaService {
	
	Turma insertOrUpdate(Turma entity);
	
	void delete(int id);
	
	List<Turma> getAll();
	
	Turma getById(int id);
	
}
