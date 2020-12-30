package br.com.java.br.com.java.heranca_polimorfismo;

/***
 * 
 * @author dionatan
 *
 */

public abstract class Shape {

	private Color color;
	
	public Shape() {
	}
	
	public Shape(Color color) {
		this.color = color;
	}
	
	public Color getColor() {
		return color;
	}
	
	public abstract double area();
}
