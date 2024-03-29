package br.com.java.jdbc.application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.java.jdbc.db.DB;
import br.com.java.jdbc.db.DbException;

/***
 * 
 * @author dionatan
 *
 */

public class Program005 {

	public static void main(String[] args) {

		Connection conn = null;
		Statement st = null;

		try {

			conn = DB.getConnection();

			conn.setAutoCommit(false);

			st = conn.createStatement();

			int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartamentId = 1");

			int x = 1;
			if (x < 2) {
				throw new SQLException("Fake error");
			}

			int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartamentId = 2");

			System.out.println("rows1 " + rows1);
			System.out.println("rows2 " + rows2);

		} catch (SQLException e) {
			try {
				conn.rollback();
				throw new DbException("Transaction rolled back! Caused by: " + e.getMessage());

			} catch (Exception e1) {
				throw new DbException("Error trying to rollback! Caused by: " + e1.getMessage());
				
			}

		} finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}

	}

}
