package br.com.fiap.banco;

public class Teste {

	public static void main(String[] args) {

		Conta cc= new Conta ();
		cc.depositar (50.0);
		cc.setAgencia (123);
		cc.setNumero (321);

		cc.depositar(1000);

		System.out.println( "Seu saldo em conta corrente é de R$ " + cc.getSaldo () );

		Conta poupanca = new Conta (111, 222, 1000);
		poupanca.retirar(50);

		System.out.println( "Seu saldo em conta poupança é de R$ " + poupanca.getSaldo () );




	}

}
