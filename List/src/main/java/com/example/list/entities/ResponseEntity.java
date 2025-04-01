package com.example.list.entities;

import java.util.List;

import com.example.list.dto.TarefaDTO;

import jakarta.validation.Valid;

public class ResponseEntity<T> {

	public static ResponseEntity<String> ok(@Valid @Valid TarefaDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

}
