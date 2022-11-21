package com.alpb.saude.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alpb.saude.entities.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long>{

}
