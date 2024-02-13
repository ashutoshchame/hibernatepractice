package myproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AFirstSTEP {
  public static void main (String[] args) throws ClassNotFoundException, SQLException {
	  //step 1 register the driver 
	  Class.forName("com.mysql.cj.jdbc.Driver");
	  
	  //step 2 Establish the connection 
	  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rock","root","Pass@2023");
	  System.out.println("connection created");
	  
	  //step 3 
	  Statement stmt = con.createStatement ();
	  String query = "select * from emp";
	  
	  ResultSet rs = stmt.executeQuery(query);
	  System.out.println("step4 running");
	  
	  while (rs.next()) {
	 String id=  rs.getString(1);
	 String name=  rs.getString(2);
	 String salary= rs.getString(3);
	 
	 System.out.println(id+" " +name+" "+salary);
	  }
  }
}
