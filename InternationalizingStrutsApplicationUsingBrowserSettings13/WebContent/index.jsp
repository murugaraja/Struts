<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/struts-bean.tld" prefix="bean"%>
<html>
<head>
<title>Strus - I18N</title>
</head>
<body>
	<table>
		<tr>
			<td><bean:message key="label.user" /></td>
			<td><input type="text" name="user" /></td>
		</tr>
		<tr>
			<td><bean:message key="label.password" /></td>
			<td><input type="password" name="pass" /></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><input type="button"
				value='<bean:message key="label.button" />' /></td>
		</tr>
	</table>
</body>
</html>