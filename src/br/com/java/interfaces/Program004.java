package br.com.java.interfaces;

import java.util.Locale;
import java.util.Scanner;

import br.com.java.interfaces.service.InterestService;
import br.com.java.interfaces.service.UsaInterestService;

/***
 * 
 * @author dionatan
 *
 */

public class Program004 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Amount: ");
		double amount = sc.nextDouble();
		System.out.println("Months: ");
		int months = sc.nextInt();
		
		InterestService is = new UsaInterestService(1.0);
		double payment = is.payment(amount, months);
		
		
		System.out.println("Payment after " + months + " months:");
		System.out.println(String.format("%.2f", payment));
		
		sc.close();
		

	}

}
