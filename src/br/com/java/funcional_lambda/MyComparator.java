package br.com.java.funcional_lambda;

import java.util.Comparator;

import br.com.java.funcional_lambda.entities.Product;

public class MyComparator implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}

}
