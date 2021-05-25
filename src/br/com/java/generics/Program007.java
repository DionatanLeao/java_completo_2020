package br.com.java.generics;

import java.util.ArrayList;
import java.util.List;

/***
 * 
 * @author dionatan
 *
 */

public class Program007 {

	public static void main(String[] args) {
		
		List<Object> myObjs = new ArrayList<>();
		myObjs.add("Maria");
		myObjs.add("João");
		
		List<? super Number> myNums = myObjs;
		
		myNums.add(10);
		myNums.add(3.14);
		
		System.out.println(myNums);
		
		//Number x = myNums.get(0); // erro compilação
		
		/**
		 * Get - Error
		 * Put - Ok
		 */

	}

}
