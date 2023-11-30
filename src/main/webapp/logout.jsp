<%
	session.invalidate();
	request.getSession().setAttribute("AUTHUSER",null);
	response.sendRedirect("login.jsp");
%>