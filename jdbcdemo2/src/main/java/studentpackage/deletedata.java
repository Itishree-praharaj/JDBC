package studentpackage;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class deletedata {
		public static void main(String[]args) throws SQLException, ClassNotFoundException {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root", "root");
			Statement st = con.createStatement();
			st.execute("delete from student where name='satya'");
			System.out.println("data deleted");
		
		
		}

	}

