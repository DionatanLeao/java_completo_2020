package br.com.java.generics;

import java.util.ArrayList;
import java.util.List;

/***
 * 
 * @author dionatan
 *
 */

public class Program006 {

	public static void main(String[] args) {
		
		//Covariância
		
		List<Integer> intList = new ArrayList<>();
		intList.add(10);
		intList.add(5);
		
		List<? extends Number> list = intList;
		
		Number x = list.get(0);
		System.out.println(x);
		
		//list.add(20); //erro de compilação
		
		/**
		 * Get - Ok
		 * Put - Error
		 */

	}

}
