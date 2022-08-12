package br.com.fiap.banco;

public class Teste {

	public static void main(String[] args) {

		ContaCorrente cc= new ContaCorrente ();
		cc.setAgencia(0123);
		cc.setNumero(0234);
		cc.setTipo("PF");
		cc.setChequeEspecial(1000);

		Conta cc2 = new ContaCorrente ();
	}

}
