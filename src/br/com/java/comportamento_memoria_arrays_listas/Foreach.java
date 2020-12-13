package br.com.java.comportamento_memoria_arrays_listas;

/***
 * 
 * @author dionatan
 *
 */

public class Foreach {

	public static void main(String[] args) {

		String[] vect = new String[] { "Mary", "Bob", "Alex" };
		
		for (int i=0; i<vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("--------------------------------");
		
		for (String nome : vect) {
			System.out.println(nome);
		}
	}

}
