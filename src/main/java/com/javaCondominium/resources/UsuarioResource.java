package com.javaCondominium.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaCondominium.entities.Usuario;
import com.javaCondominium.repositories.UsuarioRepository;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioResource {

	@Autowired
	UsuarioRepository usuarioRepository;

	@GetMapping
	public ResponseEntity<Usuario> findAll() {

		Usuario usuario = new Usuario(1L, "Luis", "email@teste", "12345678", 123);

		return ResponseEntity.ok().body(usuario);
	}

	@PostMapping
	public ResponseEntity<Usuario> salvar() {

		Usuario usuario = new Usuario(1L, "Luis", "email@teste", "12345678", 123);

		usuarioRepository.save(usuario);

		return ResponseEntity.ok().body(usuario);
	}

	@DeleteMapping
	public ResponseEntity<Usuario> deletar() {

		Usuario usuario = new Usuario(1L, "Luis", "email@teste", "12345678", 123);

		usuarioRepository.delete(usuario);

		return ResponseEntity.ok().body(usuario);
	}

}
