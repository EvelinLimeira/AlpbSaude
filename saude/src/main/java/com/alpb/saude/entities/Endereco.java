package com.alpb.saude.entities;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
@Table(name = "endereco")
public class Endereco {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long id;
	
	private String bairro;
	private String cep;
	private String logradouro;
	
	@DateTimeFormat(pattern ="dd/MM/yyyy")
	private Date dataAtualizacao;

	@DateTimeFormat(pattern ="dd/MM/yyyy")
	private Date dataCadastro;
	
	//Many Enderecos have a single Cidade
	@ManyToOne
	@JoinColumn(name="cidade_id", referencedColumnName="id", nullable=false, unique=true)
	private Cidade cidadeId;
	
	//One Endereco can have one or more Servidor
	@OneToMany(mappedBy="enderecoId")
	private Set<Servidor> servidor;
}
