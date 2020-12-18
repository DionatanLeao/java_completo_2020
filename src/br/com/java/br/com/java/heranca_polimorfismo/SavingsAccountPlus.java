package br.com.java.br.com.java.heranca_polimorfismo;

/***
 * 
 * @author dionatan
 *
 */

public class SavingsAccountPlus extends SavingsAccount {
	
	@Override
	public void withDraw(double amount) {
		balance -= amount + 2.0;
	}
}
