package br.com.grupo.alfa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.grupo.alfa.dto.TechnologyResponseDTO;
import br.com.grupo.alfa.model.Technology;
import br.com.grupo.alfa.service.TechnologyService;

@RestController @RequestMapping("/api/technologies")
public class TechnologyControlle {

	@Autowired
	private TechnologyService service;
	
	@GetMapping
	 public ResponseEntity<List<TechnologyResponseDTO>> buscarTodos() {
        return ResponseEntity.ok(service.buscarTodos());
	}
}
