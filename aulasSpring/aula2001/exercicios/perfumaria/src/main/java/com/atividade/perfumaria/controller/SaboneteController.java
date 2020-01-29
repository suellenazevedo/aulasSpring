package com.atividade.perfumaria.controller;

import java.util.List;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.atividade.perfumaria.model.Sabonete;
import com.atividade.perfumaria.service.SaboneteService;
import com.atividade.perfumaria.service.impl.SaboneteServiceImpl;

@CrossOrigin("*")
@RestController
public class SaboneteController {

	SaboneteService saboneteService = new SaboneteServiceImpl();
	
	@GetMapping("/sabonete/")
	public List<Sabonete> getAll() {
		return saboneteService.getAll();
	}
	
	@GetMapping("/sabonete/{id}")
	public ResponseEntity<Sabonete> getById(@PathVariable int id){
		Sabonete sabonete = saboneteService.getById(id);
		
		if (sabonete == null) {
			ResponseEntity.notFound();
		}
		
		return ResponseEntity.ok(sabonete);
		
	}
	
	@PostMapping("/sabonete/")
	public ResponseEntity<Sabonete> insert(@RequestBody Sabonete sabonete) {
		return ResponseEntity.ok(saboneteService.insert(sabonete));


	}
	
	@PutMapping("/sabonete/")
	public Sabonete alterar(@RequestBody Sabonete sabonete) {
		saboneteService.update(sabonete);
		return sabonete;
	}
	
	@DeleteMapping("/sabonete/{id}")
	public void delete(@PathVariable int id) {
		saboneteService.delete(id);
	}
		
	
	
}
