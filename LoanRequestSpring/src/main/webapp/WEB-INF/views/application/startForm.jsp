<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>Pokretanje instance</title>
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
	                  		 <h1>Pokretanje nove instance procesa</h1><br/>          
	             	    </div>
	             	    <div class="home">							
						</div>
						<br/><br/><br/>  
	
						<c:if test="${fn:length(formProperties) > 0}">
						 <div class="form-bottom">
						 	<br/>
							<form class="form-horizontal" name='f'
								action="<c:url value='/application/startNewInstance'/>"
								method='POST'>
												
									<!-- Treba jos dodati validaciju (da li su uneta required obelezja, 
										da li su uneta slova iako je tip long - ili obezbediti da se to onemoguci)
										Pokriti unos datuma
										Pokusati smestiti u poseban jsp fajl forme, pa ukljuciti pomocu include
					 				-->
									<c:forEach var="formProperty" items="${formProperties}">
										<c:if test="${formProperty.readable == true}">
											<div class="form-group">
												<label class="control-label col-sm-2">${formProperty.name}:</label>
												<div class="col-sm-5"> 											
												<c:if
													test="${formProperty.type.name.equals('string') || formProperty.type.name.equals('long')}">
													<input  type="text" class="form-control"
														<c:if test="${formProperty.writable==true}"> name="${formProperty.id}"</c:if>
														<c:if test="${formProperty.writable==false}"> disabled </c:if>
														value="${formProperty.value}" />
												</c:if>
						
												<c:if test="${formProperty.type.name.equals('boolean')}">
													<input type="checkbox" class="form-control"
														<c:if test="${formProperty.writable==true}"> name="${formProperty.id}"</c:if>
														<c:if test="${formProperty.writable==false}"> disabled </c:if>
														<c:if test="${formProperty.value==true}">checked </c:if> />
												</c:if>
						
												<c:if test="${formProperty.type.name.equals('enum')}">
													<select class="form-control"
														<c:if test="${formProperty.writable==true}"> name="${formProperty.id}"</c:if>
														<c:if test="${formProperty.writable==false}"> disabled </c:if>>
						
														<c:forEach var="key"
															items="${formProperty.getType().getInformation('values').keySet()}">
															<option value="${key}">${formProperty.getType().getInformation('values').get(key)}</option>
														</c:forEach>
													</select>
												</c:if>
												</div>											
											 </div>
										</c:if>
										
										<c:if test="${formProperty.readable == false}">
											<input type="hidden" name="${formProperty.id}"
												value="${formProperty.value}" />
										</c:if>
										<br />
									</c:forEach>
									
									<div class="form-group">
										<div class="col-sm-8"> 		
											<div align="center"> 
												<input type="submit" class="btn btn-primary" value="Potvrda">
											</div>	
										</div>	
									</div>								
							</form>
						  </div>
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


