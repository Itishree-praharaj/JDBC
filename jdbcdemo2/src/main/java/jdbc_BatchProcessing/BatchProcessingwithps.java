package jdbc_BatchProcessing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class BatchProcessingwithps {

	public static void main(String[] args) throws SQLException {
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","root");
		
PreparedStatement ps= con.prepareStatement("insert into employee(id,name,role,yoe)values(?,?,?,?)");
	Scanner scn=new Scanner(System.in);
	for(int i=0;i<3;i++) {
		System.out.println("enter id");
		int id=scn.nextInt();
		
		System.out.println("enter name");
		String name= scn.next();
		
		System.out.println("enter role");
		String role=scn.next();
		
		System.out.println("enter yoe");
		int yoe=scn.nextInt();
		ps.setInt(1,id);
		ps.setString(2,name);
		ps.setString(3,role);
		ps.setInt(4,yoe);
		
		ps.addBatch();
	}
	
         ps.executeBatch();
         con.close();
         System.out.println("batch executed sucessfully");
	}

}
