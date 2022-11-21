package com.alpb.saude.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alpb.saude.entities.Medicamento;

public interface MedicamentoRepository extends JpaRepository<Medicamento, Long>{

}
