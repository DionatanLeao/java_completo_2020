package br.com.java.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import br.com.java.generics.entities.Product;

/***
 * 
 * @author dionatan
 *
 */

public class Program020 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Table", 350.50));
		list.add(new Product("HD Case", 80.90));

//		List<String> names = list.stream().map(new UperCaseName()).collect(Collectors.toList());
//		names.forEach(System.out::println);
		
//		List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
//		names.forEach(System.out::println);
		
//		List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());
//		names.forEach(System.out::println);
		
//		Function<Product, String> func = p -> p.getName().toUpperCase();		
//		List<String> names = list.stream().map(func).collect(Collectors.toList());
//		names.forEach(System.out::println);
	
		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		names.forEach(System.out::println);
		
		
	}

}
