package br.com.java.heranca_polimorfismo;

/***
 * 
 * @author dionatan
 *
 */

public class Program {

	public static void main(String[] args) {

//		Account acc = new Account(0001, "Alex", 0.0);
//		BusinessAccount bacc = new BusinessAccount(0002, "Maria", 0.0, 500.0);
//
//		// UpCasting
//		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(0003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(0004, "Anna", 0.0, 0.01);

		// DownCasting
		BusinessAccount bacc2 = (BusinessAccount) acc2;
		bacc2.loan(100.0);

//		BusinessAccount bacc3 = (BusinessAccount) acc3;
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount bacc3 = (BusinessAccount) acc3;
			bacc3.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount saac = (SavingsAccount) acc3;
			saac.updateBalance();
			System.out.println("Update!");
		}
		
		Account acc1 = new Account(0005, "Jonh", 1000.0);
		acc1.withDraw(200.0);
		System.out.println(acc1.getBalance());
		
		Account acc4 = new SavingsAccount(0006, "Robert", 1000.0, 0.01);
		acc4.withDraw(200.0);
		System.out.println(acc4.getBalance());
		
		Account acc5 = new BusinessAccount(0007, "Willians", 1000.0, 500.0);
		acc5.withDraw(200.0);
		System.out.println(acc5.getBalance());
		
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1023, "Mary", 1000.0, 0.01);
		x.withDraw(50.00);
		y.withDraw(50.00);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
	}

}
