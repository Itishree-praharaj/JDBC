package jdbcdemo2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertionValues {

	public static void main(String[] args)throws ClassNotFoundException,SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","root");
	     Statement st = con.createStatement();
		st.execute("insert into employee(id,name,role,yoe) values(1,'raveesh','vice-president',17)");
		st.execute("insert into employee(id,name,role,yoe) values(2,'santosh','python-head',6)");
	st.execute("insert into employee(id,name,role,yoe) values(3,'kishore','vice-president',5)");
System.out.println("data inserted sucessfully");
	}
}
