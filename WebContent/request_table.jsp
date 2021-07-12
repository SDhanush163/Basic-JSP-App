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

<h1>Data retrieved using Controller Servlet</h1>

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
		<c:forEach items="${statusFromController}" var="status">
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