package myproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert_deleteData {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rock","root","Pass@2023");
		  System.out.println("connection created");
		  Statement stmt = con.createStatement ();
		  String query = "insert into emp (id,name,salary) values (2,'vaishu','40000')";
//		  String query = "delete from emp where id = 3;";
		 int check = stmt.executeUpdate(query);
		 System.out.println("Data Inserted = "+ check); 
		// System.out.println("Data Deleted = "+ check); 
		  
	}

}
