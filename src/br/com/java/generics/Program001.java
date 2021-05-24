package br.com.java.generics;

import java.util.Locale;
import java.util.Scanner;

import br.com.java.generics.service.PrintService;

/***
 * 
 * @author dionatan
 *
 */

public class Program001 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		PrintService<Integer> ps = new PrintService<>();

		System.out.print("How many values? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			Integer value = sc.nextInt();
			ps.addValue(value);
		}

		ps.print();
		Integer x = ps.first();
		System.out.println("First: " + x);

		sc.close();

	}

}
