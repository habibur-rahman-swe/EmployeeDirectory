<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>
		<c:out value="${message }"></c:out>
		<%-- <c:out value="${employees }"></c:out> --%>
	</h1>
	<table border="1">
		<thead>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Department</th>
				<th>Date of Birth</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${employees }" var="employee">
				<tr>
					<td>${employee.id }</td>
					<td>${employee.name }</td>
					<td>${employee.department }</td>
					<td>${employee.dob }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>


</body>
</html>