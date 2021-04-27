package br.com.java.interfaces;



import br.com.java.interfaces.entities.ComboDevice;
import br.com.java.interfaces.entities.ConcretePrinter;
import br.com.java.interfaces.entities.ConcreteScanner;

/***
 * 
 * @author dionatan
 *
 */

public class Program002 {

	public static void main(String[] args) {
		
		ConcretePrinter p = new ConcretePrinter("1080");
		p.processDoc("My Letter");
		p.print("My Letter");
		
		ConcreteScanner s = new ConcreteScanner("1080");
		s.processDoc("My Email");
		System.out.println("Scan result: " + s.scan());
		
		System.out.println();
		ComboDevice cd = new ComboDevice("2081");
		cd.processDoc("My dissertation");
		cd.print("My dissertation");
		System.out.println("Scan result: " + cd.scan());

	}

}
