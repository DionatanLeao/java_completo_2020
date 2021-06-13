package br.com.java.generics.utils;

import java.util.function.Consumer;

import br.com.java.generics.entities.Product;

/***
 * 
 * @author dionatan
 *
 */

public class PriceUpdate implements Consumer<Product> {

	@Override
	public void accept(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}
	
	
}
