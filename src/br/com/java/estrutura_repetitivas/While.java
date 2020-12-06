package br.com.java.estrutura_repetitivas;

import java.util.Scanner;

/***
 * 
 * @author dionatan
 *
 */

public class While {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		int soma = 0;

		while (x != 0) {
			soma = soma + x;
			x = sc.nextInt();
		}

		System.out.println(soma);

		sc.close();
	}

}
