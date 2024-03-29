package br.com.java.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import br.com.java.generics.entities.Product;

/***
 * 
 * @author dionatan
 *
 */

public class Program018 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Table", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		//list.removeIf(p -> p.getPrice() >= 100);
		//list.removeIf(new ProductPredicate());
		//list.removeIf(Product::staticProductPredicate);
		//list.removeIf(Product::nonStaticProductPredicate);
		//Predicate<Product> pred = p -> p.getPrice() >= 100;
		//list.removeIf(pred);
		
		list.removeIf(p -> p.getPrice() >= 100);
		
		for (Product p : list) {
			System.out.println(p);
		}

	}

}
