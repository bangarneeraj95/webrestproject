<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>  
<head>  
    <title>Spring Tiles Contact Form</title>  
</head>  
<body>  
<h2>Contact Manager</h2>  
<form:form method="post"  action="addContact.do" modelAttribute="command"  autocomplete="off">  
  
    <table>
    
      <tr>  
        <td><form:label path="id">User Id</form:label></td>  
        <td><form:input path="id" /></td>   
    </tr> 
      
    <tr>  
        <td><form:label path="firstname">First Name</form:label></td>  
        <td><form:input path="firstname" /></td>   
    </tr>  
    <tr>  
        <td><form:label path="lastname">Last Name</form:label></td>  
        <td><form:input path="lastname" /></td>  
    </tr>  
    <tr>  
        <td><form:label path="lastname">Email</form:label></td>  
        <td><form:input path="email" /></td>  
    </tr>  
    <tr>  
        <td><form:label path="lastname">Telephone</form:label></td>  
        <td><form:input path="telephone" /></td>  
    </tr>  
    <tr>  
        <td colspan="2">  
            <input type="submit" value="Add Contact"/>  
        </td>  
    </tr>  
</table>    
      
</form:form>  
</body>  
</html>  