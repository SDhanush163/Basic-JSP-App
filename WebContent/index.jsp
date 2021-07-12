<%@page import="com.dao.*"%>
<%@page import="com.entity.*"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		ArchiveBillsDao billsDao = new ArchiveBillsDao();
		List<ArchiveBills> list = billsDao.getAllArchiveBills();
		
		request.setAttribute("archiveBills", list);
	%>
	
	<%
		ArchiveReuqestStatusDao statusDao = new ArchiveReuqestStatusDao();
		List<ArchiveRequestStatus> reqStatus = statusDao.getAllArchiveRequestStatus();
	
		request.setAttribute("archiveStatus", reqStatus);
	%>
	
	<h1>Archive Bills fetched using the DB Connection using Application</h1>
	
	<table border="1"> 
	<thead>
		<tr>
			<th>Ramp</th>
			<th>Bill Issue Date</th>
			<th>Bill Seq. No.</th>
			<th>Total Bill Amount</th>
			<th>Total Current Rev.</th>
			<th>Total Past Due</th>
			<th>LEC ID</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${archiveBills}" var="bill">
			<tr>
				<td>${bill.getRampII()}</td>
				<td>${bill.getBillIssueDate()}</td>
				<td>${bill.getBillSeqNbr()}</td>
				<td>${bill.getTotalBillAmt()}</td>
				<td>${bill.getTotalCurrRev()}</td>
				<td>${bill.getTotalPastDueAmt()}</td>
				<td>${bill.getLecID()}</td>
			</tr>
		</c:forEach>
	</tbody>
	</table>
	
	<br /> Data from Server Context through Servlet : 
	<a href="ArchiveRequestStatusController">Click Here</a>
	<h1>Archive Request Status using Server Connection through Context</h1>
	
	<table border="1"> 
	<thead>
		<tr>
			<th>Ramp</th>
			<th>Bill Issue Date</th>
			<th>Requester ID</th>
			<th>Request For Date</th>
			<th>Request To Date</th>
			<th>Bill Seq. No.</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${archiveStatus}" var="status">
			<tr>
				<td>${status.getRampII()}</td>
				<td>${status.getBillIssueDate()}</td>
				<td>${status.getRequesterID()}</td>
				<td>${status.getRequestForDate()}</td>
				<td>${status.getRequestToDate()}</td>
				<td>${status.getBillSeqNum()}</td>
			</tr>
		</c:forEach>
	</tbody>
	</table>
</body>
</html>