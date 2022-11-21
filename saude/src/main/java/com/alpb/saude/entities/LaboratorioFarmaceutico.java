package com.alpb.saude.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
@Table(name = "laboratio_farmaceutico")
public class LaboratorioFarmaceutico {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private short deletado;
	
	@ManyToMany
	@JoinTable(
			name = "medicamento_laboratorio_farmaceutico",
			joinColumns = @JoinColumn(name = "medicamento_id"),
			inverseJoinColumns = @JoinColumn(name = "laboratorio_farmaceutico_id"))
	private Set<Medicamento> medicamentoLaboratorioFarmaceutico;
}
