package br.com.fiap.banco;

public class Conta {

	// Atributos de Classes
	int agencia;
	int numero;
	double saldo;


	public Conta () {

	}


	// Construtor de Classe, Classe conta
	public Conta(int agencia, int numero, double saldo) {
		super();
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}

	/**
	 * Depositar da classe Conta
	 * @param valor a ser depositado
	 */
	public void depositar (double valor) {

		this.saldo += valor;

	}

	public void retirar (double valor) {

		this.saldo -= valor;

	}

	public double verificarSaldo () {

		return this.saldo;
	}


}