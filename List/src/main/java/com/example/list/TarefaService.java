package com.example.list;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.list.Repository.TarefaRepository;
import com.example.list.Repository.UsuarioRepository;
import com.example.list.dto.Prioridade;
import com.example.list.dto.TarefaDTO;
import com.example.list.entities.Tarefa;
import com.example.list.entities.Usuario;

import ch.qos.logback.core.status.Status;

public class TarefaService {
	
	@Autowired
	TarefaRepository tarefaRepository;
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	public TarefaDTO salvarTarefa(TarefaDTO dto) {
		Tarefa task = new Tarefa();  
		task.setDescricao(dto.getDescricao());
		task.setSetor(dto.getSetor());
		task.setPrioridade(Prioridade.BAIXA);
		task.setDataCadastro(LocalDate.now());
		task.setStatus(Status.A_FAZER);
		
		Usuario user = usuarioRepository.getReferenceById(dto.getId_usuario());
		
		task.setUsuario(user);
		task = tarefaRepository.save(task);
		
		return new TarefaDTO();
	}
	
	public List<TarefaDTO> mostrarTarefas() {
		List<Tarefa> tarefas = tarefaRepository.findAll();
		return TarefaDTO.convertToDTOList(tarefas);
	}
}

