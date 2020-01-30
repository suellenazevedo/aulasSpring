package com.atividade.redeSocial.service;

import java.util.List;

import com.atividade.redeSocial.entity.Estado;

public interface EstadoService {

	List<Estado> getAll();
	
	Estado getById(int id);
	
	Estado insertOrUpdate(Estado estado);

	void delete(int id);
}
