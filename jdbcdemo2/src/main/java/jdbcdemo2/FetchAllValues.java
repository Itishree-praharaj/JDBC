package jdbcdemo2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchAllValues {
		public static void main(String[] args) throws SQLException {
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","root");
			     Statement st = con.createStatement();
			     ResultSet rs= st.executeQuery("select * from employee ");
			     rs.next();
	
	while(rs.next()) {
	System.out.println(rs.getInt("id"));
    System.out.println(rs.getString("name"));
    System.out.println(rs.getString("role"));
    System.out.println(rs.getInt("yoe"));
    //System.out.println(rs.getDouble("salary"));
    System.out.println("--------------------------");
}
}
}
