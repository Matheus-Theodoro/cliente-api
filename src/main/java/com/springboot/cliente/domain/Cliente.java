package com.springboot.cliente.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(nullable = false, length = 50)
	private String nome;

	@Column(nullable = false, length = 50)
	private String email;

	@Column(nullable = false, length = 11)
	private String cpf;

	@Column(nullable = false, length = 11)
	private String telefone;
	
	private List<Informações> informações = new ArrayList<>();
	
	
	


	public Cliente(long id, String nome, String email, String cpf, String telefone) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.telefone = telefone;
	}



	public Cliente() {
		super();
	}
	
	

	public long getId() {

        return id;
	}

	public void setId(long id) {

        this.id = id;
	}

	public String getNome() {

        return nome;
	}

	public void setNome(String nome) {

        this.nome = nome;
	}

	public String getEmail() {

        return email;
	}

	public void setEmail(String email) {

        this.email = email;
	}

	public String getCpf() {

        return cpf;

	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}



	public List<Informações> getInformações() {
		return informações;
	}



	public void setInformações(List<Informações> informações) {
		this.informações = informações;
	}



	@Override
	public int hashCode() {
		return Objects.hash(id);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return id == other.id;
	}
	
	

	
}
