package com.eletronicos.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eletronicos.model.Computador;
import com.eletronicos.model.Smartphone;
import com.eletronicos.model.Televisao;

@CrossOrigin("*")
@RestController
public class EletronicosController {
	
	List<Computador> listaCompiuter = new ArrayList<Computador>();
	
	@GetMapping("/computador")
	public List<Computador> GetAllComp(){
		listaCompiuter.add(new Computador("Dell", "IX9678697"));
		listaCompiuter.add(new Computador("Asus", "TP9678697XS"));
		listaCompiuter.add(new Computador("Positivo", "HSX155484SS"));
		return listaCompiuter;
		
	} 
	
	List<Smartphone> listaCel = new ArrayList<Smartphone>();
	
	@GetMapping("/smartphone")
	public List<Smartphone> getAllCel(){
		listaCel.add(new Smartphone("Xiaomi", "Mi 9t Pro"));
		listaCel.add(new Smartphone("Xiaomi", "Mi 9"));
		listaCel.add(new Smartphone("Xiaomi", "Mi A3"));
		return listaCel;
		}
	
	List<Televisao> listaTv = new ArrayList<Televisao>();
	
	@GetMapping("/televisao")
	public List<Televisao> GetAllTv(){
		listaTv.add(new Televisao("Sony", "PX45258"));
		listaTv.add(new Televisao("LG", "ASD45258"));
		listaTv.add(new Televisao("Panasonic", "HSD454686868"));
		
		return listaTv;
	}
	
	
	
	
}
