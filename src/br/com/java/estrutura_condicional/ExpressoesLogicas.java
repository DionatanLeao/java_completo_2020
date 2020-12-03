package br.com.java.estrutura_condicional;

import java.util.Scanner;

/***
 * 
 * @author dionatan
 *
 */

public class ExpressoesLogicas {

	public static void main(String[] args) {

		/***
		 * Operadores lógicos && E || OU ! NÃO
		 */

		Scanner sc = new Scanner(System.in);
		int hora;

		System.out.println("Quantas horas?");
		hora = sc.nextInt();

		if (hora < 12) {
			System.out.println("Bom dia");
		} else if (hora >= 12 && hora < 18) {
			System.out.println("Boa tarde");
		} else if (hora >= 18 && hora <= 24) {
			System.out.println("Boa noite");
		} else {
			System.out.println("Entrada de dados inválida");
		}

		sc.close();
	}

}
