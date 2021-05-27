package br.com.java.generics;

import java.util.Set;
import java.util.TreeSet;

import br.com.java.generics.entities.Product;

/***
 * 
 * @author dionatan
 *
 */

public class Program014 {

	public static void main(String[] args) {
		
		Set<Product> set = new TreeSet<>();
		
		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		
		for (Product product : set) {
			System.out.println(product);
		}

	}

}
