package com.alpb.saude.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

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

	@ManyToOne
	@JoinColumn(name="endereco_id", referencedColumnName="id", nullable=false, unique=true)
	private Endereco enderecoId;	
	
	@OneToMany(mappedBy="servidorId")
	private Set<Usuario> usuario;
	
	@OneToMany(mappedBy="servidorId")
	private Set<Requisicao> requisicao;
}
