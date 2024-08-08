package demo;

import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.Statement;

public class myjdbcinsert1 {

public static void main(String[] args) (

try {

Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nobs",
 System.out.println("MySQL connected and database changed to nobs"); Statement st con.createStatement();

// executing SQL DML insert row

String sql = "INSERT INTO employee VALUES(4, 'Pin', 'Canght", 10)";

int numberOfRowAffected = st.executeUpdate(sql); System.out.println("Number of rows inserted: "+numberOfRowAffected); con.close();

} catch (Exception e) (

System.out.println("Error connecting to database:"+e);
}
}
}