
	package studentpackage;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class insertdata {
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", "root");
			Statement st = con.createStatement();
			st.execute("insert into student(id,name,age) values(1,'mouni',21)");
			st.execute("insert into student(id,name,age) values(2,'mounika',22)");
			st.execute("insert into student(id,name,age) values(3,'satya',20)");
			System.out.println("data inserted");
		}

	}

