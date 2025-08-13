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
/*
Texto 1: abóbora;abobrinha;alcachofra;aspargos;batata-doce;berinjela;beterraba
Texto 2: abacate;ameixa;amora;banana;cajá;figo;maçã;melancia;uva;seriguela;manga
Texto 3: acelga;alface;alho-poró;coentro;endívia;escarola;repolho;rúcula;agrião
*/