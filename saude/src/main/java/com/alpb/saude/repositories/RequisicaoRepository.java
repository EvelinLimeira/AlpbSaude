package com.alpb.saude.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alpb.saude.entities.Requisicao;

public interface RequisicaoRepository extends JpaRepository<Requisicao, Long>{

}
