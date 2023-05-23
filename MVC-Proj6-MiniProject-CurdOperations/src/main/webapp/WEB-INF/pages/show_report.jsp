<%@ page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:choose>
	<c:when test="${!empty empsData}">
		<table border="1" bgcolor="cyan" align="center">
			<tr>
				<th>empno</th>
				<th>ename</th>
				<th>job</th>
				<th>sal</th>
				<th>DeptNo</th>
				<th>Operations</th>
			</tr>
			<c:forEach var="emp" items="${empsData}">
				<tr>
					<td>${emp.empno}</td>
					<td>${emp.ename}</td>
					<td>${emp.job}</td>
					<td>${emp.sal}</td>
					<td>${emp.deptno}</td>
					<td>
						<a href="emp_edit?no=${emp.empno}"><img src="resources/images/edit.jpg" width="40" height="20"></a>
						<a href="emp_delete?no=${emp.empno}" onclick="return confirm('Do You Want Delete')"><img src="resources/images/delete.jpg" width="40" height="20"></a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</c:when>
	<c:otherwise>
		<h1 style="color: red; text-align: center">NO record found</h1>
	</c:otherwise>
</c:choose>
<br>
<br>
<center><h3 style="color:green;text-align:center">${resultMsg}</h3></center>
<br>
<br>
<center>
	<a href="./">Home<img src="resources/images/home.jpg" width="40" height="30"></a>
</center>
<br><br>
<center>
	<a href="emp_add">Register Employee <img src="resources/images/add.jpg" width="40" height="30"></a>
</center>