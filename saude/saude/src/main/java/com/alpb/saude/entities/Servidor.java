package com.alpb.saude.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "servidor")
public class Servidor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String cargo;
	private String celular;
	private String complemento;
	private int cpf;
	
	@DateTimeFormat(pattern ="dd/MM/yyyy HH:mm")
	private Date dataAtualizacao;

	@DateTimeFormat(pattern ="dd/MM/yyyy HH:mm")
	private Date dataCadastro;

	@DateTimeFormat(pattern ="dd/MM/yyyy")
	private Date dataNascimento;
	
	private short deletado;
	private short dependente;
	private int dependentes;
	private String estadoCivil;
	private short inativo;
	private String lotacao;
	private int matricula;
	private String nome;
	private int numero;
	private String planoSaude;
	private String sexo;
	private int telefone;

	
	//endereco_id;
	//id_servidor;
	
}
