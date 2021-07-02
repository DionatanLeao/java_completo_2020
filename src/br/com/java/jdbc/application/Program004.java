package br.com.java.jdbc.application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.java.jdbc.DB;

/***
 * 
 * @author dionatan
 *
 */

public class Program004 {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement ps = null;

		try {

			conn = DB.getConnection();

			ps = conn.prepareStatement(
					"UPDATE seller" + "SET baseSalary = BaseSalary + ? " + "WHERE " + "(DepartmentId = ?)");

			ps.setDouble(1, 200.00);
			ps.setInt(2, 2);

			int rowsAffected = ps.executeUpdate();

			System.out.println("Done! Rows affected: " + rowsAffected);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DB.closeStatement(ps);
			DB.closeConnection();
		}

	}

}
