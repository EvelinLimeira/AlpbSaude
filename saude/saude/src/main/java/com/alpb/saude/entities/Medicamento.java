package com.alpb.saude.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "medicamento")
public class Medicamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private short estoque;
	private short deletado;
	private short inativo;
	private String observacao;
	
	@DateTimeFormat(pattern ="dd/MM/yyyy")
	private Date dtAtualizacao;

	@DateTimeFormat(pattern ="dd/MM/yyyy")
	private Date dtCadastro;
	
	
}
