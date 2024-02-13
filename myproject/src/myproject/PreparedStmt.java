package myproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedStmt {
		
         public static void main(String[] args) throws SQLException, ClassNotFoundException {
			Class.forName("com.mysql.cj.jdbc.Driver");
			  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rock","root","Pass@2023");
			  System.out.println("connection created");
			  
		//	PreparedStatement ps = con.prepareStatement ( "insert into emp (id,name,salary) values (3,'neha','25000')");
			  PreparedStatement ps = con.prepareStatement ( "insert into emp (id,name,salary) values (?,?,?)");
			  ps.setInt (1, 5);
			  ps.setString(2, "aaruu");
			  ps.setString(3, "24000");
            int check = ps.executeUpdate();
            System.out.println(check);
			 
	}

}
 