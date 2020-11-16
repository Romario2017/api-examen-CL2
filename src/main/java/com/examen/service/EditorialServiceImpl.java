package com.examen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.entity.Editorial;
import com.examen.repository.EditorialRepository;

@Service
public class EditorialServiceImpl implements EditorialService{

	@Autowired
	private EditorialRepository repository;
	

	@Override
	public Editorial inserta(Editorial obj) {
		return repository.save(obj);
	}


	@Override
	public List<Editorial> listaEditorial() {
		return repository.findAll();
		
	}




}
