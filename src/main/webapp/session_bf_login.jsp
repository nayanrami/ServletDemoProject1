<%
	String username = (String)request.getSession().getAttribute("AUTHUSER");
	if(username!=null){
		response.sendRedirect("home.jsp");
	}
	
%>