package br.com.java.interfaces;



import br.com.java.interfaces.entities.Printer;
import br.com.java.interfaces.entities.Scanner;

/***
 * 
 * @author dionatan
 *
 */

public class Program002 {

	public static void main(String[] args) {
		
		Printer p = new Printer("1080");
		p.processDoc("My Letter");
		p.print("My Letter");
		
		Scanner s = new Scanner("1080");
		s.processDoc("My Email");
		System.out.println("Scan result: " + s.scan());
	}

}
