package jdbcdemo2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchValues {
public static void main(String[] args) throws ClassNotFoundException,SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","root");
	     Statement st = con.createStatement();
	     ResultSet rs= st.executeQuery("select * from employee where id=1");
	     rs.next();
	     System.out.println(rs.getInt(1));   //rs.getInt("id")
	     System.out.println(rs.getString(2));//rs.getStrin("name")
	     System.out.println(rs.getString(3));//rs.getString("role")
	     System.out.println(rs.getInt(4));//rs.getint("yoe")

	}

}
