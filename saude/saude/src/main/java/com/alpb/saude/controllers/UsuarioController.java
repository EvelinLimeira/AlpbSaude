package com.alpb.saude.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alpb.saude.entities.Usuario;
import com.alpb.saude.repositories.UsuarioRepository;

@RestController
@RequestMapping(value ="/usuario")
public class UsuarioController {
	
//	@Autowired
//	private UsuarioRepository repository;
	
//	@GetMapping
//	public ResponseEntity<List<Usuario>> findAll(){
//		List<Usuario> list = new ArrayList<> ();
//		list.add(new Usuario("Evelin", 1L));
//		list.add(new Usuario("Maria", 2L));
//		return ResponseEntity.ok().body(list);
		
//		List<Usuario> result = repository.findAll();
//		return result;
//	}

}
