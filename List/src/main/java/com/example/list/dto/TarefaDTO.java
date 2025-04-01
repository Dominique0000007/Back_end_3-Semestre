package com.example.list.dto;

import java.time.LocalDate;
import java.util.List;

import com.example.list.entities.Tarefa;

public class TarefaDTO {
	
	private Long id1;
    private String descricao;
    private String setor;
    private Prioridade prioridade;
    private LocalDate dataCadastro;
    private Status status;
    private Long id_usuario;
	

	public Long getId1() {
		return id1;
	}
	
	public void setId1(Long id1) {
		this.id1 = id1;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getSetor() {
		return setor;
	}
	
	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	public Prioridade getPrioridade() {
		return prioridade;
	}
	
	public void setPrioridade(Prioridade prioridade) {
		this.prioridade = prioridade;
	}
	
	public LocalDate getDataCadastro() {
		return dataCadastro;
	}
	
	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	public Status getStatus() {
		return status;
	}
	
	public void setStatus(Status status) {
		this.status = status;
	}
	
	public Long getId_usuario() {
		return id_usuario;
	}
	
	public void setId_usuario(Long id_usuario) {
		this.id_usuario = id_usuario;
	}

	public static List<TarefaDTO> convertToDTOList(List<Tarefa> tarefas) {
		// TODO Auto-generated method stub
		return null;
	}
    
}