package com.generation.alunosapi.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.*;

import com.generation.alunosapi.model.Aluno;
import com.generation.alunosapi.repository.AlunoRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/alunos")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AlunoController {
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	@GetMapping
	public ResponseEntity<List<Aluno>> getAll(){
		return ResponseEntity.ok(alunoRepository.findAll());
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Aluno> getById(@PathVariable Long id) {
		return alunoRepository.findById(id)
				.map(resposta -> ResponseEntity.ok(resposta))
				.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
		
	}
	
	@PostMapping
	public ResponseEntity<Aluno> post(@Valid @RequestBody Aluno aluno) {
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(alunoRepository.save(aluno));
	}
	
	@PutMapping
	public ResponseEntity<Aluno> put(@Valid @RequestBody Aluno aluno) {
		return alunoRepository.findById(aluno.getId())
				.map(resposta -> ResponseEntity.status(HttpStatus.OK)
							.body(alunoRepository.save(aluno)))
				.orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
				
	}
	
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping("{id}")
	public void delete(@PathVariable Long id) {
		Optional<Aluno> aluno = alunoRepository.findById(id);
		
		if(aluno.isEmpty())
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		
		alunoRepository.deleteById(id);
		
	}
}
