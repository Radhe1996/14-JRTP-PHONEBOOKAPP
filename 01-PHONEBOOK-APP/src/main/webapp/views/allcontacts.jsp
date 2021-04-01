<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <h3>View Contacts</h3>
  <a href="Load-Form">Add New Contact</a>
  <table>
     <thead>
        <tr>
           <th> Contact Id</th>
           <th> Contact Name</th>
           <th> Contact Email</th>
           <th> Contact Number</th>
           <th> Action</th>
        </tr>
     </thead>
     <tbody>
     <c:foreach items="${contacts}"  var="contact">
     <tr> 
     <td>${contact.contactId} </td>
      <td>${contact.contactName} </td>
       <td>${contact.contactEmail} </td>
        <td>${contact.contactNumber} </td>
        <td><a href="Edit?cid=${contact.contactId}">Edit</a> <a href="Delete">Delete</a>
     </tr>
     </c:foreach>
     
     </tbody>
  </table>
</body>
</html>