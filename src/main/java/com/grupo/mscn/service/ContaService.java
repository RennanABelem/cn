package com.grupo.mscn.service;

import java.util.List;

import com.grupo.mscn.dto.ContaDto;
import com.grupo.mscn.model.Conta;

public interface ContaService {

	public void salva(ContaDto contaDto);
	public List<Conta> listar();
}
