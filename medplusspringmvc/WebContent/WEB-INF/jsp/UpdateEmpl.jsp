<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="j" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <s:form action ="update" commandName="employee" method="post">
     Code<s:input path="empcode"/>
     <s:errors path="empcode"/><br>
     Employee name<s:input path="empname"/>
     <s:errors path="empname"/>
     Job<s:input path="job"/>
     <s:errors path="job"/>
     Salary<s:input path="salary"/>
     <s:errors path="salary"/>
     DOB<s:input path="dateOfBirth"/>
     <s:errors path="dateOfBirth"/>
   <input type="submit" name="submit">
 </s:form>
</body>
</html>