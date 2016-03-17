<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<title>Oglasi</title>
		<link href="<c:url value="/resources/stylesheets/styles.css"/>"
			rel="stylesheet" />
	</head>
	<body>
			<table>
				<tr>
					<td>Id Procesa</td>
					<td>Vreme startovanja</td>
					<td>Vreme zavrsetka</td>
					<td>Zadaci na cekanju</td>
				</tr>
				<c:forEach var="i" begin="0" end="${historicProcessInstances.size()}">
				<tr>					
					<td>					
						${historicProcessInstances[i].getId()} 				
					</td>
					<td>					
						 ${historicProcessInstances[i].getStartTime()}  					
					</td>
					<td>					
						 ${historicProcessInstances[i].getEndTime()}  					
					</td>	
					<td>					
						 ${zadaciNezavrseni[i]}  					
					</td>								
				</tr>
				</c:forEach>
			</table>
		
	</body>
</html>