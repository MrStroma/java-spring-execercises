package com.example.provahibernate.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.provahibernate.entities.Saluto;
import com.example.provahibernate.repositories.SalutoRepository;

@Service
public class SalutoService {
	
	@Autowired
	private SalutoRepository salutoRepository;
	
	public Saluto saveSaluto(String messaggio) {
		Saluto saluto = new Saluto();
		saluto.setMessaggio(messaggio);
		return salutoRepository.save(saluto);
	}
}
