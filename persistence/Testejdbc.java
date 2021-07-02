package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Testejdbc {
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/test","xxxx", "xxxx");
			System.out.println("Ok, conectado ao banco");
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
