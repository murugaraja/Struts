<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Page</title>
</head>
<body>
	<html:form action="/userAction">
		<table>
			<tr>
				<td>Mobile Number :</td>
				<td><html:text property="mobileNumber" /></td>
				<td><html:errors property="mobileNumber" /></td>
			</tr>
			<tr>
				<td>Phone Number :</td>
				<td><html:text property="phoneNumber" /></td>
				<td><html:errors property="phoneNumber" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><html:submit /></td>
			</tr>
		</table>
	</html:form>
</body>
</html>