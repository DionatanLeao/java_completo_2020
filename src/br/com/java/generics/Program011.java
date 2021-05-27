package br.com.java.generics;

import java.util.Set;
import java.util.TreeSet;

/***
 * 
 * @author dionatan
 *
 */

public class Program011 {

	public static void main(String[] args) {
		
		Set<String> set = new TreeSet<>();

		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");

		System.out.println(set.contains("Notebook"));

		for (String p : set) {
			System.out.println(p);
		}

	}

}
