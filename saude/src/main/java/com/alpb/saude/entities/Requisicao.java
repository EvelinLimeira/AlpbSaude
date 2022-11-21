package com.alpb.saude.entities;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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
@Table(name = "requisicao")
public class Requisicao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@DateTimeFormat(pattern ="dd/MM/yyyy")
	private Date dataAtualizacao;

	@DateTimeFormat(pattern ="dd/MM/yyyy")
	private Date dataCadastro;
	
	@DateTimeFormat(pattern ="dd/MM/yyyy")
	private Date dataEntrega;
	
	private String descricao;
	
	private short inativo;
	
	private short deletado;
	
	@ManyToOne
	@JoinColumn(name = "servidor_id", referencedColumnName="id",nullable=false,unique=true)
	private Servidor servidorId;
	
	@ManyToMany
	@JoinTable(
			name = "requisicao_itemMedicamento",
			joinColumns = @JoinColumn(name = "itemMedicamento_id"),
			inverseJoinColumns = @JoinColumn(name = "requisicao_id"))
	private Set<ItemMedicamento> requisicaoItemMedicamento;
	
}
