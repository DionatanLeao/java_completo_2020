package br.com.java.jdbc1.application;

import java.sql.Connection;

import br.com.java.jdbc1.DB;

/***
 * 
 * @author dionatan
 *
 */

public class Program {

	public static void main(String[] args) {
		
		Connection conn = DB.getConnection();	
		System.out.println(conn);
		DB.closeConnection();

	}

}
