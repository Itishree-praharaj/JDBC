package jdbcdemo2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class UpdateValues {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","root");
     Statement st = con.createStatement();
	st.execute("update employee set name='charles' where id=3");
	System.out.println("values updated");

	}

}
