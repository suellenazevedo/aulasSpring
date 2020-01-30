package com.atividade.redeSocial.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.atividade.redeSocial.entity.Estado;
import com.atividade.redeSocial.service.EstadoService;

@RestController
@CrossOrigin("*")
public class EstadoController {

	@Autowired
	private EstadoService estadoSer;
	
	@GetMapping("/estado")
	public ResponseEntity<List<Estado>> getAllEstados(){
		return ResponseEntity.ok(this.estadoSer.getAll());
		
	}
	
	@GetMapping("/estado/{id}")
	public ResponseEntity<Estado> getByIdEstado( @PathVariable int id){
		return ResponseEntity.ok(this.estadoSer.getById(id));
	}
	
	@PostMapping("/estado")
	@ResponseStatus(HttpStatus.CREATED)
	public Estado postEstado(@Valid @RequestBody Estado estado) {
		Estado estado2 = estadoSer.insertOrUpdate(estado);
		if (estado2 == null) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Deu errado.");
		}
		return estado2;
	}
	
	@PutMapping("/estado")
	@ResponseStatus(HttpStatus.CREATED)
	public Estado putEstado(@Valid @RequestBody Estado estado) {
		Estado estado2 = estadoSer.insertOrUpdate(estado);
		if (estado2 == null) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Deu errado.");
		}
		return estado2;
	}
	
	@DeleteMapping("/estado/{id}")
	public ResponseEntity<String> delete(@PathVariable int id){
		estadoSer.delete(id);
		return ResponseEntity.ok("Estado deletado com sucesso.");
	}
}

