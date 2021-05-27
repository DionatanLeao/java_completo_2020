package br.com.java.generics;

import java.util.HashSet;
import java.util.Set;

/***
 * 
 * @author dionatan
 *
 */

public class Program010 {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();

		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");

		System.out.println(set.contains("Notebook"));

		for (String p : set) {
			System.out.println(p);
		}

	}

}
