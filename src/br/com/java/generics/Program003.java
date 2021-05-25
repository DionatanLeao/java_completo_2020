package br.com.java.generics;

import java.util.ArrayList;
import java.util.List;

/***
 * 
 * @author dionatan
 *
 */

public class Program003 {

	public static void main(String[] args) {
		
		List<?> myObjs = new ArrayList<Object>();
		List<Integer> myNumbers = new ArrayList<Integer>();
		
		myNumbers.add(1);
		myNumbers.add(2);
		myNumbers.add(3);
		
		myObjs = myNumbers;
		
		System.out.println(myObjs);
		
		Object obj;
		Integer x = 10;
		obj = x;
		
		System.out.println(obj);

	}

}
