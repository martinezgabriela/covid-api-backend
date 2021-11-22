package com.dev.software.devsoftware.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="TB_USER")
public class User implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	private String nome;

	private String email;

	private String senha;

	@OneToMany(mappedBy="user")
	@JsonIgnoreProperties("user")
	private Set<FavoriteHospital> favoriteHospital;

	public Set<FavoriteHospital> getFavoriteHospital() {
		return favoriteHospital;
	}

	public void setFavoriteHospital(Set<FavoriteHospital> favoriteHospital) {
		this.favoriteHospital = favoriteHospital;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
