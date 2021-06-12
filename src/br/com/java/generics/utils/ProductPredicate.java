package br.com.java.generics.utils;

import java.util.function.Predicate;

import br.com.java.generics.entities.Product;

/***
 * 
 * @author dionatan
 *
 */

public class ProductPredicate implements Predicate<Product>{

	@Override
	public boolean test(Product p) {
		return p.getPrice() >= 100;
	}

}
