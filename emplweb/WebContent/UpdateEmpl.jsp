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

    <j:set var="emp" value="${employee}"></j:set>
    <form action ="UpdateEmpl" method="post">
   Employee code<input type="text" name="empcode" value="${emp.empcode }" readonly><br/>
   Employee Name<input type="text" name="empname" value="${emp.empname }"><br/>
   Employee Job<input type="text" name="job" value="${emp.job }"><br/>
   Employee Salary<input type="text" name="salary" value="${emp.salary}"><br/>
   Employee Date of Birth<input type="date" name="dateofbirth" value="${emp.dateOfBirth }"><br/>
   <input type="submit" name="submit">
 </form>

</body>
</html>