package br.com.java.generics.utils;

import java.util.function.Function;

import br.com.java.generics.entities.Product;

/***
 * 
 * @author dionatan
 *
 */

public class UpperCaseName implements Function<Product, String> {

	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}
	
	
	
}
