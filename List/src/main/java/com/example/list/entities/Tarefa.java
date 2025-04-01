package com.example.list.entities;

import java.time.LocalDate;

import com.ecommerce.entities.Usuario;
import com.example.list.dto.TarefaDTO;
import com.example.list.enums.Prioridade;

import ch.qos.logback.core.status.Status;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_tarefa")
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id1;
    private String descricao;
    private String setor;

    @Enumerated(EnumType.STRING)
    private Prioridade prioridade;

    private LocalDate dataCadastro;

    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
    
    
    public String UsuarioDto(Usuario entity) {
    	Usuario entity1 = null;
    	String nome = entity1.getNome();
    	id1= entity1.getId();
    	String email;
		return email= entity1.getEmail();
    }


    public Tarefa() {
    }

 
    public Long getId1() {
        return id1;
    }

    public void setId1(Long id) {
        this.id1 = id;
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}

