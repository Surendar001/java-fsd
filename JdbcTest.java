package com;
import java.sql.*;
import java.util.Scanner;

public class JdbcTest {

	public static void main(String[] args) {
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/javatraining", "root", "MSurendar*001");
			System.out.println("Connected successfully");
			System.out.println("Driver loaded successfully");
			Statement stmt=con.createStatement();
			System.out.println("Statement is ready");
			
			Scanner obj=new Scanner(System.in);
			
			// insert operation
//			int res=stmt.executeUpdate("insert into employee values(5,'Mahesh',20000)");
//			if(res>0) {
//				System.out.println("Record inserted successfully");
//			}
			
			//insert operation using Prepared statement
//			PreparedStatement pstmt=con.prepareStatement("Insert into employee values(?,?,?)");
//			System.out.println("Enter the id");
//			int id=obj.nextInt();
//			pstmt.setInt(1, id);
//			System.out.println("Enter the name");
//			String name=obj.next();
//			pstmt.setString(2, name);
//			System.out.println("Enter the salary");
//			float salary=obj.nextFloat();
//			pstmt.setFloat(3, salary);
//			int res=pstmt.executeUpdate();
//			if(res>0) {
//				System.out.println("Record inserted successfully");
//			}
			
//			//delete query
//			int res=stmt.executeUpdate("delete from employee where id=5");
//			if(res>0) {
//				System.out.println("Record deleted successfully");
//			}else {
//				System.out.println("Record not present");
//			}
			
			// Delete query using PreparedStatement
//			PreparedStatement pstmt=con.prepareStatement("Delete from employee where id=?");
//			System.out.println("Enter the id to delete the record");
//			int id=obj.nextInt();
//			pstmt.setInt(1, id);
//			int res=pstmt.executeUpdate();
//			if(res>0) {
//				System.out.println("Record deleted successfully");
//			}else {
//				System.out.println("Record not present");
//			}
			//update query
//			int res=stmt.executeUpdate("Update employee set salary = 45000 where id=2");
//			if(res>0) {
//				System.out.println("Record updated successfully");
//			}else {
//				System.out.println("Record not present");
//			}
			// update query using prepared statement
//			PreparedStatement pstmt=con.prepareStatement("update employee set salary=? where id=?");
//			System.out.println("Enter the id to update the salary");
//			int id=obj.nextInt();
//			pstmt.setInt(2, id);
//			System.out.println("Enter the salary");
//			float salary =obj.nextFloat();
//			pstmt.setFloat(1, salary);
//			
//			int res=pstmt.executeUpdate();
//			if(res>0) {
//				System.out.println("Record updated successfully");
//			}else {
//				System.out.println("Record not found");
//			}
			//retrieve query
//			ResultSet rs=stmt.executeQuery("select * from employee");
//			while(rs.next()) {
//				System.out.println("id is "+rs.getInt(1)+"Name is"+rs.getString(2)+"Salary is"+rs.getFloat(3));
//			}
			
			//retrieve using preparedstatement
			
			PreparedStatement pstmt=con.prepareStatement("select * from employee");
			System.out.println("Enter the salary");
			float salary=obj.nextFloat();
			pstmt.setFloat(1, salary);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				//System.out.println("id is "+rs.getInt(1)+"Name is"+rs.getString(2)+"Salary is"+rs.getFloat(3));
				System.out.println("name is"+rs.getString(2));
		}
			
			rs.close();
			stmt.close();
			con.close();
			} catch (Exception e) {
			System.out.println(e);
		}
	}

}
