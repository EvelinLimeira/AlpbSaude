package com.alpb.saude.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "itemmedicamento")
public class ItemMedicamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private int entregas;
	
	private int prazo;
	
	private int quantidade;
	
	@ManyToOne
	@JoinColumn(name = "medicamento_id",referencedColumnName="id",nullable=false,unique=true)
	private Medicamento medicamentoId;
	
	@ManyToMany(mappedBy ="requisicaoItemMedicamento")
	private Set<Requisicao> requisicao;
}
