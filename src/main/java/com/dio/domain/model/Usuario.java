package com.dio.domain.model;

import java.util.List;

public class Usuario {

	private Long id;
	private String nome;
	private Conta conta;
	private Cartao cartao;
	private List<Feature> features;
	private List<New> news;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public Cartao getCartao() {
		return cartao;
	}

	public void setCartao(Cartao cartao) {
		this.cartao = cartao;
	}

	public Long getId() {
		return id;
	}

	public List<Feature> getFeatures() {
		return features;
	}

	public List<New> getNews() {
		return news;
	}

}
