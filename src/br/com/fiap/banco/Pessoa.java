package br.com.fiap.banco;

import java.io.Serializable;

public class Pessoa implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String nome;
	public String getNome() {
		return nome;
	}

	public void setnome (String nome) {
		this.nome = nome;
	}

}
