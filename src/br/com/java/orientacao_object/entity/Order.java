package br.com.java.orientacao_object.entity;

import java.util.Date;

/***
 * 
 * @author dionatan
 *
 */

public class Order {

	private Date date;
	private Product product;

	public Order(Date date, Product product) {
		super();
		this.date = date;
		this.product = product;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
