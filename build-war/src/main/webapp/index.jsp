<%@page import="org.nirkoren.maven.demo.HelloHandler"%>
<html>
<body id="colorBody" style="background-color:red; font-family: arial;">
	<h2>Welcome to DevOpsCon Demo repo</h2>
	CI/CD Workshop, Maven / Tomcat WAR example<P>
	<%
		String prefix = "<B>Text from Java class:</B> ";
		HelloHandler handler = new HelloHandler();
		out.print(prefix + handler.sayHello());
	%>
	<script>
		const colors = ["red", "blue", "green", "orange", "purple", "yellow"];
		let idx = 0;
		setInterval(function() {
			idx = (idx + 1) % colors.length;
			document.getElementById("colorBody").style.backgroundColor = colors[idx];
		}, 1000);
	</script>
</body>
</html>
