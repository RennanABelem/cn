package com.grupo.mscn.service;

import java.util.List;

import com.grupo.mscn.dto.ContaDto;
import com.grupo.mscn.model.Conta;
import com.grupo.mscn.response.MessageResponse;

public interface ContaService {

	public MessageResponse salva(ContaDto contaDto);
	public List<Conta> listar();
}
