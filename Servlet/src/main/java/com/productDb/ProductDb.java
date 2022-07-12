package com.productDb;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ProductDb extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		try{
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			String cname=request.getParameter("cname");
			String pname=request.getParameter("pname");
			int qty=Integer.parseInt(request.getParameter("qty"));
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/sys", "priya", "Priya056*");
			Statement st=con.createStatement();
			
			String qry="insert into sys.product values('"+cname+"','"+pname+"','"+qty+"')";
			int i=st.executeUpdate(qry);
			out.println("<h1>Product successfully added to your SHOPPING CART!</h1>");
			}
			catch(Exception e)
			{
			System.out.print(e);
			e.printStackTrace();
			}
		
	}


}
