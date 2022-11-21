package com.alpb.saude.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

import java.util.Date;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

@Getter
@Setter

@AllArgsConstructor

@NoArgsConstructor
@Entity
@Table(name = "usuario")
public class Usuario implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String login;
	
	private String senha;
	private String lembrete;
	private String role;
	private short deletado;
	private short inativo;
	
	@DateTimeFormat(pattern ="dd/MM/yyyy")
	private Date dataCadastro;
	
	@DateTimeFormat(pattern ="dd/MM/yyyy")
	private Date dataEntrega;
	
	@ManyToOne
	@JoinColumn(name = "id_servidor")
	private Servidor servidor;
	
//	@Override
//	public int hashCode() {
//		return Objects.hash(id);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Usuario other = (Usuario) obj;
//		return Objects.equals(id, other.id);
//	}
//	
	
}
