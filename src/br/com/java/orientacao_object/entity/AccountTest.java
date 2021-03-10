package br.com.java.orientacao_object.entity;

import java.util.Locale;
import java.util.Scanner;

/***
 * 
 * @author dionatan
 *
 */

public class AccountTest {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;

		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter account holder: ");
		String holder = sc.nextLine();
		System.out.println("Is there an initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.println("Enter initial deposit value; ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		} else {
			account = new Account(number, holder);
		}

		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter value deposit: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Update account data: ");
		System.out.println(account);

		System.out.println();
		System.out.print("Enter withdraw value: ");
		double withDrawValue = sc.nextDouble();
		account.withdraw(withDrawValue);
		System.out.println("Update account data: ");
		System.out.println(account);
		
		sc.close();

	}

}
