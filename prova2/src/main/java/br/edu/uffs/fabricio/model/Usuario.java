package br.edu.uffs.fabricio.model;

import javax.persistence.*;
import javax.validation.constraints.*;
//import org.apache.commons.codec.digest.DigestUtils;

import org.hibernate.validator.constraints.*;
import org.hibernate.validator.constraints.br.CPF;

@Entity
@Table(name = "usuario")
public class Usuario {
	
	@Id
	@NotNull
	//@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "sequencia")
	@SequenceGenerator(name="sequencia", sequenceName="usuario_seq", initialValue = 1, allocationSize = 1)
	private int id_usuario;
	@Size(min=3, max=30, message="Deve ter tamanho entre 3 e 30")
	private String nome;
	@CPF(message="CPF inválido")
	private String cpf;
	@NotEmpty(message="Não pode ser nula")
	private String senha;
	@Email(message="Email inválido")
	private String email;
	
	public int getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
