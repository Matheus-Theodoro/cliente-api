package com.springboot.cliente;

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
}
