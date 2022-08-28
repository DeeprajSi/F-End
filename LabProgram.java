package demo;

import java.sql.*;


//write

public class LabProgram {
		  public static void main(String[] args) throws SQLException {
			 
		   
			 
			        //Registering the Driver
			        DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
			        //Getting the connection
			        String mysqlUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			        Connection con = DriverManager.getConnection(mysqlUrl, "User_name", "password");
			        System.out.println("Connection established......");
			        //Creating the Statement
			        Statement stmt = con.createStatement();


			        //Query to create a table, insert emliment!
			        String query = "INSERT INTO CUSTOMERS VALUES(1345,'parlavi',20,3084.02,'delhi')";
			        
			           
			          
			        
			        stmt.execute(query);
			       
			        System.out.println("Enter data in the Table Created......");
			 
		    
		  }
}

				  
				  
				 