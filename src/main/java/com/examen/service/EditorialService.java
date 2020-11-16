package com.examen.service;

import java.util.List;


import com.examen.entity.Editorial;

public interface EditorialService {

	public abstract Editorial inserta(Editorial obj);
	public abstract List<Editorial> listaEditorial();
}
