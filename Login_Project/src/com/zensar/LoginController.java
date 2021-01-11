package com.zensar;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.zensar.bean.*;

public class LoginController extends HttpServlet{

	public void doGet(HttpServletRequest request,HttpServletResponse response)
	{
		String requestAction = request.getParameter("requestAction");
		if(requestAction.equalsIgnoreCase("login"))
		{
		 int userid = Integer.parseInt(request.getParameter("userid"));  
	     String password = request.getParameter("password");  
	    
	    LoginRepository loginRepository = new LoginRepository();
	    boolean result = loginRepository.loginMethod(userid,password);
	    		
	    if(result) {
	    	try {
	    	HttpSession session = request.getSession();
	    	session.setAttribute("userid",userid);
	    	
	    	RequestDispatcher rd=request.getRequestDispatcher("login.jsp");  
            rd.forward(request,response);
	    	}
	    	catch(Exception e) {
		    	System.out.println(e);
	    }
	}
	    
	    else{  
	    	 System.out.println("Login Unsuccessfull"); 
	         String errormessage = "Invalid Credentials";
	         request.setAttribute("errormessage",errormessage);
	        try {    
	        RequestDispatcher rd=request.getRequestDispatcher("openLogin.jsp");  
           rd.forward(request,response);  
	        }
	        catch(Exception e) {
		    	System.out.println(e);
		    }
	    }  
}
}
	public void doPost(HttpServletRequest request,HttpServletResponse response)
	{
		doGet(request,response);
		      
	}
}