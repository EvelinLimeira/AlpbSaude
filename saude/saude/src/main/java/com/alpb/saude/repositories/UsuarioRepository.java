package com.alpb.saude.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alpb.saude.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	
}
