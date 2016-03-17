<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>Pregled zadataka</title>
		<link href="<c:url value="/resources/stylesheets/styles.css"/>"
			rel="stylesheet" />
			<link href="<c:url value="/resources/stylesheets/reset.css" />"
			rel="stylesheet">
		<link
			href="<c:url value="/resources/bootstrap/css/bootstrap-theme.min.css" />"
			rel="stylesheet">
		<link
			href="<c:url value="/resources/bootstrap/css/bootstrap.min.css" />"
			rel="stylesheet">		
		<script type="text/javascript"
			src="<c:url value="/resources/bootstrap/js/bootstrap.min.js" />"></script>
		<script type="text/javascript"
			src="<c:url value="/resources/js/jquery-2.1.0.min.js" />"></script>
	<body>
		<div class="container-fluid">
		  <div class="navbar navbar-default navbar-fixed-top" role="navigation">
	         <div class="container">
	             <div class="navbar-header">
	                 <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
	                     <span class="sr-only">Toggle navigation</span>
	                     <span class="icon-bar"></span>
	                     <span class="icon-bar"></span>
	                     <span class="icon-bar"></span>
	                 </button>
	                 <a class="navbar-brand"></a><h3 class="navbar-text">Tender-NS</h3>
	             </div>
	             <div class="navbar-collapse collapse" >
	                 <ul class="nav navbar-nav navbar-right">          
	                     <li onclick="$('.navbar-toggle').click()"><a href="./tasksList"><h4>Moji zadaci</h4></a></li>
	                     <li onclick="$('.navbar-toggle').click()"><a href="./newInstance"><h4>Pokreni proces</h4></a></li>
	                     <li onclick="$('.navbar-toggle').click()"><a href="./oglasi"><h4>Oglasi</h4></a></li>
	                     <li onclick="$('.navbar-toggle').click()"><a href="./procesi"><h4>Procesi</h4></a></li>                 
	                     <li><a href="<c:url value="/j_spring_security_logout"/>"><h4>Odjava</h4></a></li>
	                 </ul>
	               </div>
	           </div>
	        </div>
	         <br/><br/><br/><br/><br/>
	          <div class="top-content">	
		        <div class="inner-bg">
		         	<div class="container">
			         	<div align="center">                 
	                  		 <h1>Pregled zadataka</h1> <br/><br/>            
	             	    </div>
						<div class="message"><font size="4">${message}</font></div>
						<h3>Vaši zadaci:</h3>
						<c:if test="${fn:length(myTasks) > 0}">							
							<ol>
								<c:forEach var="task" items="${myTasks}">
									<li><a
										href="${pageContext.request.contextPath}/application/showTask/${task.id}"><font size="4"><c:out
												value="${task.name}, id = ${task.id}" /></font></a></li>
								</c:forEach>
							</ol>
						</c:if>
						<br/>
						
						<h3>Zadaci koje možete prihvatiti:</h3>
						<c:if test="${fn:length(candidateTasks) > 0}">							
							<ol>
								<c:forEach var="task" items="${candidateTasks}">
									<li><a
										href="${pageContext.request.contextPath}/application/claim/${task.id}"><font size="4"><c:out
												value="${task.name}, id = ${task.id}" /></font></a></li>
								</c:forEach>
							</ol>
						</c:if>
						
						<br/><br/>
						<div class="home">
							<a href="${pageContext.request.contextPath}/application/welcome"><font size="4">Početna</font></a>
						</div>
					</div>
				</div>
			</div>
	  </div>
	</body>
</html>


