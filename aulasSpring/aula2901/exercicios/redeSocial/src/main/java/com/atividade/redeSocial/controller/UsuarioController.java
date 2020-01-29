package com.atividade.redeSocial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.atividade.redeSocial.entity.Usuario;
import com.atividade.redeSocial.service.UsuarioService;


@RestController
@CrossOrigin("*")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;

	
	@GetMapping("/usuario")
	public ResponseEntity<List<Usuario>> getAllUsuario() {
		return ResponseEntity.ok(this.usuarioService.getAll());
	}
	
	@GetMapping("/usuario/{id}")
	public ResponseEntity<Usuario> getByIdUsuario(@PathVariable int id) {
		return ResponseEntity.ok(usuarioService.getById(id));
	}
	
	@PostMapping("/usuario/")
	public ResponseEntity<Usuario> postUsuario(@RequestBody Usuario usuario) {
		return ResponseEntity.ok(usuarioService.insertOrUpdate(usuario));
	}
	
	@PutMapping("/usuario")
	public ResponseEntity<Usuario> putUsuario(@RequestBody Usuario usuario) {
		return ResponseEntity.ok(usuarioService.insertOrUpdate(usuario));
	}
	@DeleteMapping("/usuario/{id}")
	public ResponseEntity<String> deleteUsuario(@PathVariable int id) {
		usuarioService.delete(id);
		return ResponseEntity.ok("Usuario deletado"); 
	}
}
