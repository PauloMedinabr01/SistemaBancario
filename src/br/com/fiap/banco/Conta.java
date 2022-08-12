package br.com.fiap.banco;

import java.io.Serializable;

/**
 * Classe que abstrai uma Conta Bancaria
 * @author br_pa Paulo Medina
 * Version 1.0
 */

public class Conta implements Serializable {

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Atributos de Classes
	private int agencia;
	private int numero;
	private double saldo;

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

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