<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h2>Contact Info</h2>
    <form:form action="saveContact?contactId= ${contact.contactId} }" method="POST" modelattribute="contact">
    
    <table>
        <tr>
           <td>Name</td>
           <td><form:input path="contactName"/></td>
           </tr>
           <tr>
           <td>Email</td>
           <td><form:input path="contactEmail"/></td>
           </tr>
           <tr>
           <td>PhoneNumber</td>
           <td><form:input path="contactNumber"/></td>
           </tr>
           <tr>
           <td></td>
           <td><input type="submit" value="submit"></td>
           </tr>

    </table>
    </form:form>
    <a href="view-contacts">view all contacts</a>
</body> 
</html>