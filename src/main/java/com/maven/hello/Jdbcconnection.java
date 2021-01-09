package com.maven.hello;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Jdbcconnection {

public static void main(String[] args) throws SQLException, ClassNotFoundException {
   Scanner sc=new Scanner(System.in);
   int id;
   System.out.println("enter the ID:");
   id=sc.nextInt();
Class.forName("com.mysql.jdbc.Driver");
Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bala","root","root");
 String query="select phoneno from cust where id=?";
 PreparedStatement st=cn.prepareStatement(query);
 st.setInt(1,id);
 ResultSet rs=st.executeQuery();
 while(rs.next())
{
System.out.println("phnno :  " + rs.getInt(1));
}
rs.close();
st.close();
cn.close();
}

}

