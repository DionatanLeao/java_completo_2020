package br.com.java.generics;

import java.util.ArrayList;
import java.util.List;

import br.com.java.generics.entities.Circle;
import br.com.java.generics.entities.Rectangle;
import br.com.java.generics.entities.Shape;

/***
 * 
 * @author dionatan
 *
 */

public class Program005 {

	public static void main(String[] args) {

		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));
		
		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));

		System.out.println("Total area: " + totalArea(myShapes));
		System.out.println("Total area: " + totalArea(myCircles));

	}

	private static double totalArea(List<? extends Shape> list) {
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		return sum;
	}

}
