package com.alpb.saude.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alpb.saude.entities.Cidade;

public interface EnderecoRepository extends JpaRepository<Cidade, Long>{

}
