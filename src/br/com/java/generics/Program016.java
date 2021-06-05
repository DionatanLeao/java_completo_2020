package br.com.java.generics;

import java.util.Map;
import java.util.TreeMap;

/***
 * 
 * @author dionatan
 *
 */

public class Program016 {

	public static void main(String[] args) {

		Map<String, String> cookies = new TreeMap<>();

		cookies.put("username", "Maria");
		cookies.put("email", "maria@email.com");
		cookies.put("phone", "99711122");

		cookies.remove("email");
		cookies.put("phone", "99711133");

		System.out.println("All cookies:");
		
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		System.out.println("Phone number: " + cookies.get("phone"));
		System.out.println("Email: " + cookies.get("email"));
		System.out.println("Size: " + cookies.size());

		for (String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}

	}

}
