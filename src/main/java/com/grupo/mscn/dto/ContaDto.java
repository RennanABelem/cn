package com.grupo.mscn.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class ContaDto {

	@NotEmpty(message = "O campo [nomeTitular] não pode ser nulo.")
	@Size(min = 2, message = "O campo [nomeTitular] deve conter no minimo 2 caracteres")
	private String nomeTitular;
	
	@NotNull(message = "O campo [numeroConta] não pode ser nulo.")
	@Pattern(regexp = "[0-9]+", message = "O campo [numeroConta] é do tipo numerico.")
	@Size(min = 4, max = 4, message = "O campo [numeroConta] deve conter 4 digitos.")
	private String numeroConta;
	
	@NotNull(message = "O campo [saldo] não pode ser nulo")
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
