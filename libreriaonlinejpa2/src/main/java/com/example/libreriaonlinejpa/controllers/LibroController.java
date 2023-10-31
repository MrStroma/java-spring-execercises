package com.example.libreriaonlinejpa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.libreriaonlinejpa.dtos.LibroDTO;
import com.example.libreriaonlinejpa.services.LibroService;

@RestController
@RequestMapping("/libri")
public class LibroController {
	
	@Autowired
	LibroService ls;
		
	 	@GetMapping("/libri")
	    public ResponseEntity<List<LibroDTO>> getBooks() throws Exception {
	        List<LibroDTO> libri = ls.getAll();
	       
	        return new ResponseEntity<>(libri, HttpStatus.OK);
	    }
	 	
	 	@GetMapping("/saluto")
		public void saluto() {
	 		System.out.println("ciao");
		}
	 	
	 	@PostMapping("/libro")
	    public ResponseEntity<LibroDTO> addBook(@RequestBody LibroDTO libro) throws Exception {
	        ls.save(libro);
	        return new ResponseEntity<>(null, HttpStatus.OK);
	    }
	 	
	 	 @PostMapping("/{autoreId}/add/{libroId}")
	     public ResponseEntity<String> addStudentToCourse(@PathVariable int autoreId, @PathVariable int libroId) {
	         ls.collegaAutoreLibro(autoreId, libroId);
	         return new ResponseEntity<>("aggiunto perfettamente", HttpStatus.OK);
	     }
	 	
	 	
}
