package com.atividade.escola.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atividade.escola.entity.Turno;
import com.atividade.escola.repository.TurnoRepository;
import com.atividade.escola.service.TurnoService;

@Service
public class TurnoServiceImpl implements TurnoService{

	@Autowired
	private TurnoRepository repository; 
	
	@Override
	public Turno insertOrUpdate(Turno entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(int id) {
		this.repository.deleteById(id);
	}

	@Override
	public List<Turno> getAll() {
		return (List<Turno>)repository.findAll();
	}

	@Override
	public Turno getById(int id) {
		return this.repository.findById(id).get();
	}
	

}
