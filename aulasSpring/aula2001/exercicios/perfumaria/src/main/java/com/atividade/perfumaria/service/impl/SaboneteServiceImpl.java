package com.atividade.perfumaria.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.atividade.perfumaria.model.Sabonete;
import com.atividade.perfumaria.service.SaboneteService;

public class SaboneteServiceImpl implements SaboneteService {
	static List<Sabonete> sabonetes = new ArrayList<Sabonete>();
	
	private static int incrmt = 0;

	@Override
	public Sabonete insert(Sabonete sabonete) {
		incrmt++;
		sabonete.setId(incrmt);
		this.sabonetes.add(sabonete);
		return sabonete;
	}

	@Override
	public Sabonete update(Sabonete sabonete) {
		Sabonete aux = getById(sabonete.getId());
		
		if (aux != null) {
			aux.setId(sabonete.getId());
			aux.setPreco(sabonete.getPreco());
		}
		return aux;
	}

	@Override
	public void delete(Sabonete sabonete) {
		delete(sabonete.getId());
		
	}

	@Override
	public void delete(int id) {
		int p = -1;
		for (int i = 0; i < this.sabonetes.size(); i++) {
			if (this.sabonetes.get(i).getId() == id) {
				p = i;
				break;
			}
		}
		if (p >= 0) {
			this.sabonetes.remove(p);
		}
	}

	@Override
	public Sabonete getById(int id) {
		for (Sabonete sabonete : sabonetes) {
			if (sabonete.getId() == id) {
				return sabonete;
			}
		}
		return null;
	}

	@Override
	public List<Sabonete> getAll() {
		return sabonetes;
	}
	
	
	
}
