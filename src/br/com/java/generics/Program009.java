package br.com.java.generics;

import br.com.java.generics.entities.Client;

/***
 * 
 * @author dionatan
 *
 */

public class Program009 {

	public static void main(String[] args) {

		String a = "Maria";
		String b = "Maria";

		String c = "Maria";
		String d = "Alex";
		String e = "Alex";

		System.out.println(a.equals(b));
		System.out.println(c.hashCode());
		System.out.println(d.hashCode());
		System.out.println(e.hashCode());

		System.out.println("---------------------------------");

		Client c1 = new Client("Maria", "maria@email.com");
		Client c2 = new Client("Maria", "maria@email.com");
		
		String s1 = "Test";
		String s2 = "Test";

		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2);
		
		System.out.println("--------------------------------");
		System.out.println(s1 == s2);

	}

}
