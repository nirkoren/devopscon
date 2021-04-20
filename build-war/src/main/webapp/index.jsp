<%@page import="org.nirkoren.maven.demo.HelloHandler"%>
<html>
<body style="background-color:yellow; font-family: arial;">
	<h2>Welcome to DevOpsCon Demo project</h2>
	CI/CD Workshop, Maven / Tomcat WAR example<P>
	<%
		String prefix = "<B>Read info from Java class:</B> ";
		HelloHandler handler = new HelloHandler();
		out.print(prefix + handler.sayHello());
	%>
</body>
</html>
