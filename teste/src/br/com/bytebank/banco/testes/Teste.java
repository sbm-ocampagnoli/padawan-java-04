package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste {
	public static void main(String[] args) {

	    System.out.println("x");
	    System.out.println(3);
	    System.out.println(false);

	    ContaCorrente cc = new ContaCorrente(22, 33);
	    Object cp = new ContaPoupanca(33, 22);
	    Object cliente = new Cliente();

	    System.out.println(cc.toString());
	    System.out.println(cp);
	    System.out.println(cliente);
	    
	}
}
