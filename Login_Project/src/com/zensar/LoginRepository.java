package com.zensar;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import com.zensar.utility.DBUtil;

public class LoginRepository {

	public boolean loginMethod(int userid,String password)
	{
		boolean result=false;
		Connection con = DBUtil.getMySqlDbConnection();
	    String sql = "select * from login where userid=?";
		
	    try
	    {
	    	PreparedStatement pst = con.prepareStatement(sql);
	    	pst.setInt(1,userid);
	    	ResultSet rs = pst.executeQuery();
	    	while(rs.next()) 
	    	 {
				 String passwordFromDB = rs.getString("password");
				 if(password.equalsIgnoreCase(passwordFromDB)) 
				 {
					 result=true;
				 }
			 }
	    }
	    catch(Exception e) {
			   System.out.println(e);
		   }
	    return result;
	}
	
}
