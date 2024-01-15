package jdbc_demo;

import java.sql.SQLException;

public class loadandregisterdriver {

		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("class loaded sucessfully");
		

	}

}
