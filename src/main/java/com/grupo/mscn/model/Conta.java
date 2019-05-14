package com.grupo.mscn.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.grupo.mscn.dto.ContaDto;

@Entity
public class Conta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = true)
	private Long numeroConta;
	
	private String nomeTItular;
	private Double saldo;
	
	public Conta() {}
	
	public Conta(ContaDto contaDto) {
		this.nomeTItular = contaDto.getNomeTitular();
		this.numeroConta =  Long.valueOf(contaDto.getNumeroConta()).longValue();
		this.saldo = contaDto.getSaldo();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeTItular() {
		return nomeTItular;
	}

	public void setNomeTItular(String nomeTItular) {
		this.nomeTItular = nomeTItular;
	}

	public Long getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(Long numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

}
