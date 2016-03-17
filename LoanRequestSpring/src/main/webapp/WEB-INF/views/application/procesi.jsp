<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<title>Procesi</title>
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
	</head>
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
                  		 <h2>Pregled aktivnih i završenih procesa</h2> <br/><br/><br/>           
             	    
			         <div class="row">
		               <div class="col-lg-12">
		                <div class="table-responsive">
							<table class="table table-striped">
								<tr>
									<td><b>Id Procesa</b></td>
									<td><b>Vreme startovanja</b></td>
									<td><b>Vreme zavrsetka</b></td>
									<td><b>Zadaci na cekanju</b></td>
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
						 </div>
					  </div>
				   </div>
				 </div>
				 
			   </div>
		    </div>
		 </div>		
	</body>
</html>