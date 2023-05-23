<%@ page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<h1 style="color: blue; text-align: center">cust Registraction page</h1>

<frm:form action="register" method="POST" modelAttribute="cust">

	<table border=1>

		<tr>
			<td>Customer Number:</td>
			<td><frm:input path="cNo" /></td>
		</tr>

		<tr>
			<td>Customer Name:</td>
			<td><frm:input path="cName" /></td>
		</tr>

		<tr>
			<td>Customer Address:</td>
			<td><frm:input path="cAddress" /></td>
		</tr>

		<tr>
			<td>Customer bill:</td>
			<td><frm:input path="billAmt" /></td>
		</tr>

		<tr>
			<td><input type="submit" value="register"></td>
		</tr>
	</table>
</frm:form>