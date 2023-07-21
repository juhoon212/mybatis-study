<%@page import="xyz.itwill.dao.MyHewonInterfaceDAO"%>
<%@page import="xyz.itwill.dto.MyHewon"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	List<MyHewon> hewonList = MyHewonInterfaceDAO.getDAO().selectHewonList();
%>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	
	
	
</body>
</html>