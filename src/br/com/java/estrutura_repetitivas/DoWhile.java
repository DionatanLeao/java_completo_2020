package br.com.java.estrutura_repetitivas;

import java.util.Locale;
import java.util.Scanner;

/***
 * 
 * @author dionatan
 *
 */

public class DoWhile {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char sn;
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double c = sc.nextDouble();
			double formula = 9.0 * c /5.0 + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.2f%n", formula);
			System.out.print("Deseja repetir (s/n)? ");
			sn = sc.next().charAt(0);
		} while (sn == 's');
		
		sc.close();
	}
}
