package com.igordev.usuariodepartamento.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.igordev.usuariodepartamento.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
}


