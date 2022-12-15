package com.libro.service.repositorio;

import com.libro.service.entidades.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Integer>{

	List<Libro> findByUsuarioId(int usuarioId);
	
}
