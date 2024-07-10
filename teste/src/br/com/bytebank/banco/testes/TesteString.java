package br.com.bytebank.banco.testes;

public class TesteString {
	public static void main(String[] args) {

		String nome = "AlurA";

		String outra = nome.replace("A", "a");

		System.out.println(outra);
		System.out.println(nome);

		String nomeTeste = "Otavio          ";

		String teste = nomeTeste.trim();

		System.out.println(nomeTeste);
		System.out.println(teste);
		
		String nomeTeste02 = "Otavio";

		String teste02 = nomeTeste.substring(2);

		System.out.println("\n" + nomeTeste02);
		System.out.println(teste02);
		
		String nomeTeste03 = "Otavio";

		int posicao = nomeTeste03.length() - 1;

		System.out.println("\n" + nomeTeste03);
		System.out.println(posicao);
		
		String vazio = "Alura";
		
		System.out.println(vazio.contains("Alu"));
		
		
		
		
	}

}
