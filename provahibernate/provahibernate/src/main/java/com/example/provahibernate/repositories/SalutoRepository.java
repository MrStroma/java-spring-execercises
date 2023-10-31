package com.example.provahibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.provahibernate.entities.Saluto;

public interface SalutoRepository extends JpaRepository<Saluto, Long> {
	
}
