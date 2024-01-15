package jdbc_PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertEmployeeDynamically {

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","root");
	     Scanner sc = new Scanner(System.in);
	     System.out.println("enter id");
	     int id=sc.nextInt();
	     
	     System.out.println("enter name");
	     String name = sc.next();
	     
	     System.out.println("enter role");
	     String role = sc.next();
	     
	     System.out.println("enter years of experience");
	     int yoe = sc.nextInt();
	     
	     PreparedStatement ps = con.prepareStatement("insert into employee(id,name,role,yoe)value(?,?,?,?)");
	    		 ps.setInt(1, id);
	     ps.setString(2, name);
	     ps.setString(3, role);
	     ps.setInt(4, yoe);
	     
	     ps.execute();
	     System.out.println("values inserted");
	     
	
	  

	}

}
