package com.atividade.perfumaria.service;

import java.util.List;

import com.atividade.perfumaria.model.Sabonete;

public interface SaboneteService {
	
	Sabonete insert(Sabonete sabonete);
	
	Sabonete update(Sabonete sabonete);
	
	void delete(Sabonete sabonete);
	
	void delete(int id);
	
	Sabonete getById(int id);
	
	List<Sabonete> getAll();
}
