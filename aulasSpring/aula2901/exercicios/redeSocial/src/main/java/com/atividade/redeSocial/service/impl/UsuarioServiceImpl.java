package com.atividade.redeSocial.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atividade.redeSocial.entity.Usuario;
import com.atividade.redeSocial.repository.UsuarioRepository;
import com.atividade.redeSocial.service.*;


@Service
public class UsuarioServiceImpl implements UsuarioService{

	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	
	@Override
	public List<Usuario> getAll() {
		return (List<Usuario>)usuarioRepository.findAll();
	}


	@Override
	public Usuario getById(int id) {
		
		return usuarioRepository.findById(id).orElse(null);
	}

	@Override
	public Usuario insertOrUpdate(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

	@Override
	public void delete(int id) {
		usuarioRepository.deleteById(id);	
	}
	
}
