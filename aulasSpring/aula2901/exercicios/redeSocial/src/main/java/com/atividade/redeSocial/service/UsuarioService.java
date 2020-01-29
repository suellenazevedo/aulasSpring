package com.atividade.redeSocial.service;

import java.util.List;

import com.atividade.redeSocial.entity.Usuario;


public interface UsuarioService {

	List<Usuario> getAll();
	
	Usuario getById(int id);
	
	Usuario insertOrUpdate(Usuario usuario);
	
	void delete(int id);
}
