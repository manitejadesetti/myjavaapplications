<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="j" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
   <table border="2">
    <tr>
       <th>Empl Code</th>
       <th>Empl Name</th>
       <th>Job</th>
       <th>salary</th>
       <th>Date of Birth</th>
    </tr>
    <j:forEach var="emp" items="${List}">
       <tr>
          <td><j:out value="${emp.empcode}"></j:out> </td> 
          <td><j:out value="${emp.empname}"></j:out> </td> 
          <td><j:out value="${emp.job}"></j:out> </td>
          <td><j:out value="${emp.salary}"></j:out> </td>
          <td><j:out value="${emp.dateOfBirth}"></j:out> </td>
          <td><a href="update?code=${emp.empcode}">update</a></td>
          <td><a href="delete?code=${emp.empcode}">delete</a></td>
       </tr>
       </j:forEach>
   </table>
</body>
</html>