package br.com.java.orientacao_objeto.entites;

/***
 * 
 * @author dionatan
 *
 */

public class Triangle {

	public double a;
	public double b;
	public double c;

	/**
	 * Calcula a área do Triangulo
	 * 
	 * @return
	 */
	public double area() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}
