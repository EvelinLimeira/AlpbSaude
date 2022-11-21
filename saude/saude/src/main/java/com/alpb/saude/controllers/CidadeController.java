package com.alpb.saude.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.alpb.saude.entities.Cidade;
import com.alpb.saude.repositories.CidadeRepository;

@RestController
@RequestMapping(value ="/cidade")
public class CidadeController {

	@Autowired
	private CidadeRepository repository;

	@PostMapping
	public ResponseEntity<Cidade> gravar(@RequestBody Cidade cidade){
		repository.save(cidade);
		Optional<Cidade> cidade1 = repository.findById(cidade.getId());
		return ResponseEntity.ok(cidade1.get());
	}

	@GetMapping("/lista")
	public List<Cidade> lista(){
		return repository.findAll();
	}
}
