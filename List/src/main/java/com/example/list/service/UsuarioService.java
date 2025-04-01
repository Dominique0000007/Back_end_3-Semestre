package com.example.list.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.list.controller.RestController;

@RestController
@RequestMapping("usuario")
public class UsuarioService {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<String> criarUsuario() {
        return ResponseEntity.ok("Usuário criado com sucesso!");
    }
}
