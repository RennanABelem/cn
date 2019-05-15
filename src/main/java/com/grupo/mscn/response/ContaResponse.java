package com.grupo.mscn.response;

import com.grupo.mscn.model.Conta;

public class ContaResponse {

	private String nomeTitular;
	private Double saldo;
	private Long numeroConta;
	
	public ContaResponse(Conta conta) {
		this.nomeTitular = conta.getNomeTItular();
		this.saldo = conta.getSaldo();
		this.numeroConta = conta.getNumeroConta();
	}
	
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public Long getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(Long numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	
	
}
