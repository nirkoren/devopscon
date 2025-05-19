<%@page import="org.nirkoren.maven.demo.HelloHandler"%>
<html>
<body style="background-color:pink ; font-family: arial;">
	<h2>Welcome to DevOpsCon Demo repo</h2>
	CI/CD Workshop, Maven / Tomcat WAR example<P>
	<%
		String prefix = "<B>Text from Java class:</B> ";
		HelloHandler handler = new HelloHandler();
		out.print(prefix + handler.sayHello());
	%>
</body>
</html>
