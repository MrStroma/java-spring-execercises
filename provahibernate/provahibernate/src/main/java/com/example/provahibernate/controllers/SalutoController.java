package com.example.provahibernate.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.provahibernate.entities.Saluto;
import com.example.provahibernate.services.SalutoService;

@RestController
public class SalutoController {
	
	@Autowired
	private SalutoService salutoService;
	
	@GetMapping("/saluto")
	public Saluto saluto(@RequestParam String messaggio) {
		return salutoService.saveSaluto(messaggio);
	}
}
