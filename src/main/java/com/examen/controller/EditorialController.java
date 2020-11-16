package com.examen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen.entity.Editorial;
import com.examen.service.EditorialService;

@RestController
@RequestMapping("/api/rest/editorial/")
public class EditorialController {
	
	@Autowired
	private EditorialService service;
	
	@PostMapping
	public ResponseEntity<Editorial> inserta(@RequestBody Editorial obj){
		return ResponseEntity.ok(service.inserta(obj));
	}
	
	@GetMapping
	public ResponseEntity<List<Editorial>> lista() {
		return ResponseEntity.ok(service.listaEditorial());
	}
	
}



