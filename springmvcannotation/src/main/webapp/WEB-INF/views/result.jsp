<%@page import="edu.home.data.LoginBean" %>
<html>
	<body>
		
		<h1>
			<%= ((LoginBean)request.getAttribute("loginBean")).getMessage() %>
		</h1>	
	</body>
</html>