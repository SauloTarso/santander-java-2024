package com.dio.domain.model;

import java.math.BigDecimal;

public class Cartao {

	private Long id;
	private String numbero;
	private BigDecimal limite;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumbero() {
		return numbero;
	}

	public void setNumbero(String numbero) {
		this.numbero = numbero;
	}

	public BigDecimal getLimite() {
		return limite;
	}

	public void setLimite(BigDecimal limite) {
		this.limite = limite;
	}

}