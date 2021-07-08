package com.javaCondominium.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaCondominium.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
		
}
