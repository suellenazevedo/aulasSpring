package com.atividade.informatica.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.atividade.informatica.model.Produto;
import com.atividade.informatica.service.ProdutoService;

public class ProdutoServiceImpl implements ProdutoService{
	
	static List<Produto> produtos = new ArrayList<Produto>();
	private static int incrmt = 0;
	
	
	@Override
	public Produto insert(Produto produto) {
		incrmt++;
		produto.setId(incrmt);
		this.produtos.add(produto);
		return produto;
	}
	
	@Override
	public Produto update(Produto produto) {
		Produto aux = getById(produto.getId());
		
		if (aux != null) {
			aux.setNome(produto.getNome());
			aux.setPreco(produto.getPreco());
		}
		return aux;
	}
	
	@Override
	public void delete(Produto produto) {
		delete(produto.getId());
		
	}
	
	@Override
	public void delete(int id) {
		int posicao = -1;
		for (int i = 0; i < this.produtos.size(); i++) {
			if (this.produtos.get(i).getId() == id); {
				posicao = i;
				break;
			}
		}
		if (posicao >= 0) {
			this.produtos.remove(posicao);
		}
	}
	
	@Override
	public Produto getById(int id) {
		for (Produto produto : produtos) {
			if (produto.getId() == id) {
				return produto;
			}
			
		}
		return null;
	}
	
	@Override
	public List<Produto> getAll() {
		return produtos;
	}

	
	
	
}
