package com.crud.operations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.database.connection.Jdbc_Connection;

public class Insert{
	
	public void insert_values(int deptno,String dname,String location)
	{
		Jdbc_Connection obj_con=new Jdbc_Connection();
		Connection con= obj_con.getConnection();
		
		PreparedStatement ps=null;
		String query="insert into dept(deptno,dname,location)values(?,?,?)";
		//String query="update dept set location='TN' where deptno=20";
			
		try {
		
			ps = con.prepareStatement(query);
			ps.setInt(1, deptno);
			ps.setString(2, dname);
			ps.setString(3,location);
			
			ps.executeUpdate(query);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	    try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}




