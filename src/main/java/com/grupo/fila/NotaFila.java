package com.grupo.fila;

public class NotaFila {

	private Double valorTotal;
	private String numeroConta;

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	@Override
	public String toString() {
		return "NotaFila [valorTotal=" + valorTotal + ", numeroConta=" + numeroConta + "]";
	}
	
	

}