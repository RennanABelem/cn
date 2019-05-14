package com.grupo.mscn.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class ContaDto {

	@NotEmpty(message = "O campo [nomeTitular], não pode ser nulo.")
	private String nomeTitular;
	
	@NotEmpty(message = "O campo [numeroConta], não pode ser nulo.")
	private String numeroConta;
	
	@NotNull(message = "O campo [saldo], não pode ser nulo")
	private Double saldo;

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

}
