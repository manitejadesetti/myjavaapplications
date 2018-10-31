<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
      <s:form action="addempl" commandName="employee" method="post">
         Employee Code<s:input path="empcode"/>
         <s:errors path="empcode" cssClass="error"></s:errors><br>
         Employee Name<s:input path="empname"/>
         <s:errors path="empname" cssClass="error"></s:errors><br>
         Job<s:input path="job"/><br>
         Salary<s:input path="salary"/>
         <s:errors path="salary" cssClass="error"></s:errors><br>
         Date of Birth<s:input path="dateOfBirth"/>
         <input type="submit">
      </s:form>
</body>
</html>