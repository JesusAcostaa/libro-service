package com.libro.service.servicios;

import com.libro.service.entidades.Libro;
import com.libro.service.repositorio.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService {

	@Autowired
	private LibroRepository libroRepository;
	
	public List<Libro> getAll(){
		return libroRepository.findAll();
	}
	
	public Libro getLibroById(int id) {
		return libroRepository.findById(id).orElse(null);
	}
	
	public Libro save(Libro libro) {
		Libro nuevoLibro = libroRepository.save(libro);
		return nuevoLibro;
	}
	
	public List<Libro> byUsuarioId(int usuarioId){
		return libroRepository.findByUsuarioId(usuarioId);
	}
}
