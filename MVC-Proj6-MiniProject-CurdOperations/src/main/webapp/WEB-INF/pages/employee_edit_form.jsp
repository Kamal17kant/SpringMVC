<%@ page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>
<h1 style="color: red; text-align: center">Employee Edit page</h1>

<frm:form modelAttribute="emp">
	<table align="center" bgcolor="cyan">
	<tr>
			<td>Emp No</td>
			<td><frm:input path="empno" readonly="true"/></td>
		</tr>
		<tr>
			<td>Emp Name</td>
			<td><frm:input path="ename"/></td>
		</tr>
		<tr>
			<td>Employee Desg</td>
			<td><frm:input path="job" /></td>
		</tr>
		<tr>
			<td>Employee salary</td>
			<td><frm:input path="sal" /></td>
		</tr>
		<tr>
			<td>Employee DeptNo</td>
			<td><frm:input path="deptno" /></td>
		</tr>
		<tr>
			<td><input type="submit" value="update"></td>
			<td><input type="reset" value="cancle"></td>
		</tr>
	</table>
</frm:form>