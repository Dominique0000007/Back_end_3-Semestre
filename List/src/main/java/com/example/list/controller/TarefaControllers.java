package com.example.list.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.list.TarefaService;
import com.example.list.dto.TarefaDTO;
import com.example.list.entities.ResponseEntity;
import com.example.list.service.PostMapping;
import com.example.list.service.RequestMapping;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/Tarefa")
public class TarefaControllers {

    @Autowired
    TarefaService tarefaService;

    @PostMapping
    public ResponseEntity<String> criarTarefa(@Valid @RequestBody TarefaDTO dto) {
        dto = tarefaService.salvarTarefa(dto);
        return ResponseEntity.ok(dto);
    }

    @GetMapping
    public ResponseEntity<String> listarTarefas() {
        List<TarefaDTO> tarefas = tarefaService.mostrarTarefas();
        return ResponseEntity.ok(tarefas); 
    }
}
