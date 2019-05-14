package com.grupo.mscn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grupo.mscn.dto.ContaDto;
import com.grupo.mscn.model.Conta;
import com.grupo.mscn.repository.ContaRepository;
import com.grupo.mscn.response.MessageResponse;
import com.grupo.mscn.service.ContaService;

@Service
public class ContaServiceImpl implements ContaService{

	@Autowired
	private ContaRepository contaRepository;
	
	@Override
	public MessageResponse salva(ContaDto contaDto) {
		Conta conta = new Conta(contaDto);
		contaRepository.save(conta);
		return new MessageResponse("Conta registrada com sucesso!");
	}
	
	@Override
	public List<Conta> listar(){
		return contaRepository.findAll();
	}
}
