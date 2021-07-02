package br.com.java.jdbc.application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.java.jdbc.db.DB;
import br.com.java.jdbc.db.DbIntegrityException;

/***
 * 
 * @author dionatan
 *
 */

public class Program005 {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement ps = null;

		try {

			conn = DB.getConnection();

			ps = conn.prepareStatement(
					"DELETE FROM departament"
				+	"WHERE "
				+	"iD = ?");
			
			ps.setInt(1, 5);

			int rowsAffected = ps.executeUpdate();

			System.out.println("Done! Rows affected: " + rowsAffected);

		} catch (SQLException e) {
			throw new DbIntegrityException(e.getMessage());
		} finally {
			DB.closeStatement(ps);
			DB.closeConnection();
		}

	}

}
