package com.javaCondominium.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaCondominium.entities.Morador;

public interface MoradorRepository extends JpaRepository<Morador, Long>{

}
