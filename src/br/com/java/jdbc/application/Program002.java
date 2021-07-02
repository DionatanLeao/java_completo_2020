package br.com.java.jdbc.application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.java.jdbc.db.DB;

/***
 * 
 * @author dionatan
 *
 */

public class Program002 {

	public static void main(String[] args) {

		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;

		try {

			conn = DB.getConnection();
			st = conn.createStatement();
			rs = st.executeQuery("SELECT * FROM departament");

			while (rs.next()) {
				System.out.println(rs.getInt("Id") + rs.getString("Name"));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DB.closeResultSet(rs);
			DB.closeStatement(st);
			DB.closeConnection();
		}

	}

}
