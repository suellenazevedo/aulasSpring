package com.atividade.redeSocial.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atividade.redeSocial.entity.Estado;
import com.atividade.redeSocial.repository.EstadoRepository;
import com.atividade.redeSocial.service.EstadoService;

@Service
public class EstadoServiceImpl implements EstadoService{

	@Autowired
	private EstadoRepository estadoRepo;
	
	
	@Override
	public List<Estado> getAll() {
		
		return (List<Estado>)estadoRepo.findAll();
		
	}

	@Override
	public Estado getById(int id) {
		
		return estadoRepo.findById(id).orElse(null);
		
	}

	@Override
	public Estado insertOrUpdate(Estado estado) {
		
		return estadoRepo.save(estado);
		
	}
	

	@Override
	public void delete(int id) {
		
		estadoRepo.deleteById(id);
		
	}

}
