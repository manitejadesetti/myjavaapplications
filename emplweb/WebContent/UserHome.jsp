<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
         <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="j" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<j:if test="${sessionScope.user!=null}">
<ul style="list-style-type:none; float: right;">
  <li><a href="Logout">Logout</a></li>
</ul>

<ul style="list-style-type:none;">
   <li><a href="ViewEmpls">View All Employees</a></li>
   <li><a href="ViewEmplByID.jsp">View Employee by ID</a></li>
</ul>
</j:if>
<j:if test="${sessionScope.user==null}">
   <j:out value="User not Autherised"></j:out>
</j:if>

</body>
</html>