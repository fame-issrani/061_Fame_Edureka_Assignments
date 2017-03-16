package com.edureka.session_three;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

class MenuDrivenJDBC
 {
 public static void main(String args[])
 {
	 final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	 final String DB_URL="jdbc:mysql://localhost:3306/SHOPPING_CART";
	 final String DB_PASSWORD="password";
	 final String DB_HOST="root";
 Connection con;
 Statement state;
 ResultSet rs;
 int ch;
 try
 {
 Class.forName(JDBC_DRIVER);
 System.out.println("Driver Loaded");
 con= DriverManager.getConnection(DB_URL,DB_HOST,DB_PASSWORD);
 System.out.println("Statement object created");

 do
 {
 System.out.println("\n");
 System.out.println("Menu:");
 System.out.println("1.Insert Record into the Table");
 System.out.println("2.Update The Existing Record.");
 System.out.println("3.Display all the Records from the Table");
 System.out.println("4.Exit");
 System.out.println("Enter your choice: ");

 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 ch=Integer.parseInt(br.readLine());

 switch(ch)
 {
 case 1:
 System.out.println("Enter User Name: ");
String name=br.readLine();
 System.out.println("Enter User Address: ");
 String address=br.readLine();
 System.out.println("Enter User Email: ");
 String email=br.readLine();
 String sql="insert into USER values(null,?,?,?)";
 PreparedStatement p=con.prepareStatement(sql);
 p.setString(1,name);
 p.setString(2,address);
 p.setString(3,email);
 p.executeUpdate();
 System.out.println("Record Added");
 //p.close();
 //con.close();
 break;

 case 2:
 System.out.println("Enter USER ID for the record you wish to Update: ");
 int userId=Integer.parseInt(br.readLine());
	 System.out.println("Enter User Name: ");
	 name=br.readLine();
	 System.out.println("Enter User Address: ");
	 address=br.readLine();
	 System.out.println("Enter User Email: ");
	 email=br.readLine();
 sql="update USER set USER_NAME=?, USER_ADDRESS=?, USER_EMAIL=? where USER_ID=?";
 p=con.prepareStatement(sql);
	 p.setString(1,name);
	 p.setString(2,address);
	 p.setString(3,email);
  p.setInt(4,userId);
 p.executeUpdate();
 System.out.println("Record Updated");
 //p.close();
 //con.close();
 break;

 case 3:
 state=con.createStatement();
 sql="select * from USER";
 rs=state.executeQuery(sql);
 while(rs.next())
 {
 System.out.println("\n");
	 System.out.print("\t" +rs.getInt("USER_ID"));
 System.out.print("\t" +rs.getString("USER_NAME"));
 System.out.print("\t" +rs.getString("USER_ADDRESS"));
 System.out.print("\t" +rs.getString("USER_EMAIL"));
 }
 break;

 case 4:
 System.exit(0);

 default:
 System.out.println("Invalid Choice");
 break;
 }
 }while(ch!=4);
 }catch(Exception e)
 {
 System.out.println(e);
 }
 }
 }