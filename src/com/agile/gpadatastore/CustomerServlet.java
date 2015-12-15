package com.agile.gpadatastore;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyService;

public class CustomerServlet  extends HttpServlet{

	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		
		PrintWriter out=response.getWriter();
		
		int cusid=Integer.parseInt(request.getParameter("cusid"));
		String cusname=request.getParameter("cusname");
		String place=request.getParameter("place");
		
		
		CustomerPojo cuspojo=new CustomerPojo();
		cuspojo.setCusid(cusid);
		cuspojo.setCusname(cusname);
		cuspojo.setPlace(place);
		
		ObjectifyService.register(CustomerPojo.class);//register the entity
		Objectify ofy = ObjectifyService.begin();
		ofy.
		
		
		
		
		
	}
	
}
