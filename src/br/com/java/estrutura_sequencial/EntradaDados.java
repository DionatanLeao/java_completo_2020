package br.com.java.estrutura_sequencial;

import java.util.Scanner;

/***
 * 
 * @author dionatan
 *
 */

public class EntradaDados {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s;
		s = sc.next();
		System.out.println("Você digitou: " + s);

		int i;
		i = sc.nextInt();
		System.out.println("Você digitou: " + i);

		double d;
		d = sc.nextDouble();
		System.out.println("Você digitou: " + d);

		char c;
		c = sc.next().charAt(0);
		System.out.println("Você digitou: " + c);

		int e;
		String s1, s2, s3;
		e = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println("Dados digitados: ");
		System.out.println(e);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();

	}

}
