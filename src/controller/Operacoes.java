package controller;

import java.util.Scanner;

public class Operacoes {
	
	public Operacoes() {
		super();
	}
	
	public void texto() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira um texto: ");
		String texto = scan.nextLine();
		
		String[] vetorTexto = texto.split(";");
		int contagem = 0;
		
		for(String palavra: vetorTexto) {
			contagem += 1;
		}
		
		System.out.println("Quantidade de partes: " +contagem);
		scan.close();
	}
	
}
