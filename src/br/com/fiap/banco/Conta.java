package br.com.fiap.banco;

/**
 * Classe que abstrai uma Conta Bancaria
 * @author br_pa Paulo Medina
 * Version 1.0
 */

public class Conta {

	// Atributos de Classes
	int agencia;
	int numero;
	double saldo;

	public Conta () {

	}

	/**
	 * Realiza um deposito na conta corrente 
	 * @param agencia O numero da agencia
	 * @param numero O numero da conta
	 * @param saldo O valor a ser depositado
	 * @return O numero do protocolo de confirmação
	 */

	// Construtor de Classe, Classe conta
	public Conta(int agencia, int numero, double saldo) {

		super();
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;

	}

	/**
	 * Acrescenta valor ao Saldo da Conta
	 * @param valor a ser depositado
	 */

	public void depositar (double valor) {

		this.saldo += valor;

	}

	/**
	 * Retira um valor do Saldo da Conta
	 * @param valor que será retirado
	 * @see depositar
	 */

	public void retirar (double valor) {

		this.saldo -= valor;

	}

	/**
	 * Verifica o Saldo da Conta
	 * @return Valor do Saldo da Conta
	 */

	public double verificarSaldo () {

		return this.saldo;

	}


}