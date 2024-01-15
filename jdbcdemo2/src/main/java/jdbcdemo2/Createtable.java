package jdbcdemo2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Createtable {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","root");Class.forName("com.mysql.cj.jdbc.Driver");
	
	     Statement st = con.createStatement();
		st.execute("create table employee(id int,name varchar(20),role varchar(20),yoe int)");
		System.out.println("table created sucessfully");
	}

	}

