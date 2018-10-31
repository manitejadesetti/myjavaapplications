<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="j" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
     .nav {
       list-style-type:none;
     }
     .nav li {
       float: right;
       padding:15px;
     }
     .main li a {
              margin-top:360px;
              text-align:center;     
     }
</style>
</head>
<body>
<j:if test="${sessionScope.user!=null}">
   <ul class="nav">
     <li><a href="">ADMIN</a></li>
     <li><a href="LoginPage.jsp">Logout</a></li>
   </ul>
   <ul class="main" style="list-style-type:none">
    <li><a href="AddEmployee.jsp">Add Employee</a></li>
    <li><a href="ViewEmpls">View All Employee</a></li>
    <li><a href="ViewEmplByID.jsp">View Employee by ID</a></li>
    <li><a href="UpdateEmpl.jsp">Update Employee</a></li>
    
    
   </ul>
   </j:if>
   <j:if test="${sessionScope.user==null}">
   <j:out value="not Authorized"></j:out>
   </j:if>

</body>
</html>