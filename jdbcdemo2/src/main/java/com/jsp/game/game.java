package com.jsp.game;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class game {
			
			public static void main(String[]args) throws SQLException, ClassNotFoundException {
				int totalscore = 0;
				int chances=3;
				while(chances>0) {
				Random r = new Random();
				int number = r.nextInt(9)+1;
				System.out.println(number);
				System.out.println("enter user number");
				Scanner scn = new Scanner(System.in);
				int n= scn.nextInt();
				if(number==n) {
					totalscore+=10;
				}else {
					chances--;
				}
			}
				LocalDate date = LocalDate.now();
				System.out.println("game is over");
				System.out.println("total score = "+ totalscore);
				System.out.println(date);
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", "root");
				PreparedStatement ps = con.prepareStatement("insert into gamedata values(?,?,?,?,?,?)");
				//ps.setInt(1, "id");
				//ps.setString(2, "name");
				//ps.set
				
			}
			
			}
