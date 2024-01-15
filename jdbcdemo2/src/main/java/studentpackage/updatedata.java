package studentpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class updatedata {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","root");
		Statement st = con.createStatement();
		st.execute("update student set name='sri' where id=2");
		System.out.println("data updated");
	}

}

