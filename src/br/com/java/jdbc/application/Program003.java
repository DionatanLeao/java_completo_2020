package br.com.java.jdbc.application;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import br.com.java.jdbc.db.DB;

/***
 * 
 * @author dionatan
 *
 */

public class Program003 {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Connection conn = null;
		PreparedStatement ps = null;

		try {

			conn = DB.getConnection();
			ps = conn.prepareStatement("INSERT INTO seller " + "(Name, Email, BirthDate, baseSalary, DepartamentId) "
					+ "VALUES " + "(?, ?, ?, ?, )",
					Statement.RETURN_GENERATED_KEYS);

			ps.setString(1, "Carl Purple");
			ps.setString(2, "carl@email.com");
			ps.setDate(3, new Date(sdf.parse("22/04/1985").getTime()));
			ps.setDouble(4, 3000.00);
			ps.setInt(5, 4);

			int rowsAffected = ps.executeUpdate();

			if (rowsAffected > 0) {
				ResultSet rs = ps.getGeneratedKeys();
				while (rs.next()) {
					int id = rs.getInt(1);
					System.out.println("Done! Id = " + id);
					
				}
			}
			else {
				System.out.println("No rown affected!");
			}

		} 
		catch (SQLException e) {
			e.printStackTrace();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			DB.closeStatement(ps);
			DB.closeConnection();
		}

	}

}
