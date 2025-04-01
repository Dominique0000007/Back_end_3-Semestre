package com.example.list.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Table(name = "tb_usuario")
@Entity

 
public class Usuario {

	@OneToMany
	private List<Tarefa>tarefa;

	public List<Tarefa> getTarefa() {
		return tarefa;
	}
	public void setTarefa(List<Tarefa> tarefa) {
		this.tarefa = tarefa;
	}
	public long getId() {
		return id;
	}

	@Id
	@GeneratedValues(strategy = GenerationType.IDENTITY)
	private long id;
	private String nome;
	@Colum(unique = true)//unique permite não cadastar email repitido
	private String email;
	
//	existe um botão que tira o super, valeu Letícia :)
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
}
	
	
	

