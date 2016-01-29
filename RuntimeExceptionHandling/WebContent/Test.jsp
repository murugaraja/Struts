<%@ page errorPage="err.jsp"%>

<html>
<body>
	<%
		int x = 1;
		if (x == 1) {
			throw new RuntimeException("Error condition!!!");
		}
	%>
</body>
</html>