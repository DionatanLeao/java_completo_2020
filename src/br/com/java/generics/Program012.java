package br.com.java.generics;

import java.util.LinkedHashSet;
import java.util.Set;

/***
 * 
 * @author dionatan
 *
 */

public class Program012 {

	public static void main(String[] args) {

		Set<String> set = new 	LinkedHashSet<>();

		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
		
		set.remove("Tablet");
		set.removeIf(x -> x.length() >= 3);

		System.out.println(set.contains("Notebook"));

		for (String p : set) {
			System.out.println(p);
		}

	}

}
