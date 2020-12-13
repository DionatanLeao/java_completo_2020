package br.com.java.comportamento_memoria_arrays_listas;

/***
 * 
 * @author dionatan
 *
 */

public class BoxingUnBoxingWrapper {

	public static void main(String[] args) {
		
		//Boxing
		int x = 20;
		Object obj = x;
		System.out.println(obj);
		
		//UnBoxing
		int y = (int) obj;
		System.out.println(y);
	}

}
