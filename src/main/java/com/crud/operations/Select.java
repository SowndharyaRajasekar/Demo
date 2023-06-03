package com.crud.operations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.database.connection.Jdbc_Connection;

public class Select {
	
	public ArrayList<Bean> select_values()
	{
		Jdbc_Connection obj_con=new Jdbc_Connection();
		Connection con= obj_con.getConnection();
		
		
		
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		ArrayList<Bean> mylist= new ArrayList<Bean>();
		
		try {
			String select="select *from dept";
			ps=con.prepareStatement(select);
			rs=ps.executeQuery();
			
			while (rs.next()) {
				
				Bean bean=new Bean();
				bean.setDeptno(rs.getString("deptno"));
				bean.setDname(rs.getString("dname"));
				bean.setLocation(rs.getString("location")); 
				mylist.add(bean);
			}
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mylist;
		
				
		
		
		
		
		
		
		
		
	}

}
