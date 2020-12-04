package br.com.java.estrutura_condicional;

import java.util.Scanner;

/***
 * 
 * @author dionatan
 *
 */

public class ExemploOperadora {

	public static void main(String[] args) {

		/***
		 * Operadores de atribuição cumulativa 
		 * 
		 * a +=b | a = a + b 
		 * a -=b | a = a - b 
		 * a *=b | a = a * b 
		 * a /=b | a = a / b 
		 * a %=b | a = a % b
		 */

		Scanner sc = new Scanner(System.in);

		int minutos = sc.nextInt();

		double conta = 50.0;

		if (minutos > 100) {
			conta += (minutos - 100) * 2.0;
		}

		System.out.printf("Valor da conta = R$ %.2f%n", conta);

		sc.close();
	}
}
