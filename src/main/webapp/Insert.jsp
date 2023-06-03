<%@page import="com.crud.operations.Bean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.crud.operations.Select"%>
<%@page import="java.util.Iterator"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<form action="insert" method="post">
<h4>insert values</h4>
Deptno:<input type="text" name="deptno"><br>
Dname:<input type="text" name="dname"><br>
Location:<input type="text" name="location"><br>
<input type="submit" value="Insert">

</form>
</div>
</body>
</html>
<hr>


<%

Select select=new Select();
ArrayList<Bean> mylist=select.select_values();

Iterator <Bean> iList= mylist.iterator();
%>
<table border="1">
<%
while(iList.hasNext()){
	Bean bean=new Bean();
	bean=iList.next();
%>
<tr>
	<td> <%=bean.getDeptno() %> </td>
	<td><%=bean.getDname() %> </td>
	<td><%=bean.getLocation() %> </td>
	</tr>

<%
}
%>
</table>


