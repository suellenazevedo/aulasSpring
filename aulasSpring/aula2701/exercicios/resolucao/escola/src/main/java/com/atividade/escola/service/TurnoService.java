package com.atividade.escola.service;

import java.util.List;

import com.atividade.escola.entity.Turno;


public interface TurnoService {
	
	Turno insertOrUpdate(Turno entity);
	
	void delete(int id);
	
	List<Turno> getAll();
	
	Turno getById(int id);
}
