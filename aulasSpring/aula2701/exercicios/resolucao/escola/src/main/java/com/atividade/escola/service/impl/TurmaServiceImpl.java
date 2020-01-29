package com.atividade.escola.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atividade.escola.entity.Turma;
import com.atividade.escola.repository.TurmaRepository;
import com.atividade.escola.service.TurmaService;

@Service
public class TurmaServiceImpl implements TurmaService{

	@Autowired
	private TurmaRepository repository; 
	
	@Override
	public Turma insertOrUpdate(Turma entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(int id) {
		this.repository.deleteById(id);
	}

	@Override
	public List<Turma> getAll() {
		return (List<Turma>)repository.findAll();
	}

	@Override
	public Turma getById(int id) {
		return this.repository.findById(id).get();
	}
}
