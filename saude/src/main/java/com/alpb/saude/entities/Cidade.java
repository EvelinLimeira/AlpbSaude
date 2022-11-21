package com.alpb.saude.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
@Table(name = "cidade")
public class Cidade {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String codigoIbge;
	private String nome;
	private String nomeAcentuado;
	private String tipoLocalidade;
	private String uf;
	
	//One Cidade has more than one Endereco
	@OneToMany(mappedBy="cidadeId")
	private Set<Endereco> endereco;

	public Long getId() {
		return id;
	}
}
