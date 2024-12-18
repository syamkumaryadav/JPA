<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="mapping" modelAttribute="reference" method="POST">
		<table>
			<tr>
				<td>Field 1 I :</td>
				<td><form:input path="field1"/></td>
			</tr>
			<tr>
				<td>Field 2 I :</td>
				<td><form:input path="field2"/></td>
			</tr>
			<tr>
				<td>Field 3 S :</td>
				<td><form:input path="field3"/></td>
			</tr>
			<tr>
				<td>Field 4 D :</td>
				<td><form:input path="field4"/></td>
			</tr>
			<tr>
				<td ></td>
				<td ><button>submit</button></td>
			</tr>
		</table>
	</form:form>
</body>
</html>