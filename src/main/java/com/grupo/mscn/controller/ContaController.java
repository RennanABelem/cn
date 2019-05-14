package com.grupo.mscn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grupo.mscn.dto.ContaDto;
import com.grupo.mscn.model.Conta;
import com.grupo.mscn.service.ContaService;

@RestController
@RequestMapping("conta")
public class ContaController {

	@Autowired
	private ContaService contaService;
	
	@PostMapping("salvar")
	public ResponseEntity<?> salvar(@RequestBody ContaDto contaDto){
		contaService.salva(contaDto);
		return new ResponseEntity<>( HttpStatus.CREATED);
	}
	
	@GetMapping("listar")
	public ResponseEntity<List<Conta>> listar(){
		return new ResponseEntity<List<Conta>>(contaService.listar(), HttpStatus.OK);
	}
	
}
