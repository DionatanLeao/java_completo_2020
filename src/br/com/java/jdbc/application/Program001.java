package br.com.java.jdbc.application;

import java.sql.Connection;

import br.com.java.jdbc.DB;

/***
 * 
 * @author dionatan
 *
 */

public class Program001 {

	public static void main(String[] args) {
		
		Connection conn = DB.getConnection();	
		System.out.println(conn);
		DB.closeConnection();

	}

}
