<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*,java.util.*"%>
<%@ page import="javax.servlet.http.HttpServletResponse" %>
<%
String id=request.getParameter("id");
out.println("Data Deleted Successfully!");

try
{
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tfms", "root", "root123");
Statement st=conn.createStatement();

int i=st.executeUpdate("DELETE FROM trainee WHERE traineeId="+id);
/* out.println("Data Deleted Successfully!"); */
if(i>0){
	response.sendRedirect("show.jsp");
}



}
catch(Exception e)
{

e.printStackTrace();
}
%>