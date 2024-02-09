<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"  %>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
    
<html>
<head>
<meta charset="UTF-8">
 <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
        integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<title>Success page of complex form</title>
</head>

<body>
	<h3>${student.userName}</h3>
	<h3>${student.userId}</h3>
	<h3>${student.userDOB}</h3>
	<h3>${student.courses}</h3>
	<h3>${student.gender}</h3>
	<h3>${student.studentType}</h3>
	<h3>${student.address.street}</h3>
	<h3>${student.address.city}</h3>
	
</body>
</html>