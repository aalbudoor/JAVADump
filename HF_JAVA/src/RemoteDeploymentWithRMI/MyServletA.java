package RemoteDeploymentWithRMI;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


//must extend servlet
public class MyServletA extends HttpServlet {
	
	
	//override the doGet for simple HTTP GET messages
	//the web browser calls the method (request) so you can get data out of it and a (response) object that youll use to send back a response ( a page)
	public void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//this tells the server and browser what kind of 'thing' is coming back from the server as a result of this servlet running
		response.setContentType("text/html");
		
		//the response object gives us an output stream to write information back out to the server.
		PrintWriter out = response.getWriter();
		
		String message = "If your reading this, it worked! ";
		
		//What we write is an HTML page! the page gets delivered through the server back to the browser, just
		//like any other html page,
		out.println("<HTML><BODY>");
		out.println("<H1>" + message + "</H1>");
		out.println("</BOSY></HTML>");
		out.close();
		
	}

}


/*

HTML page with a link to this servlet

<HTML>
		<BODY>
		
		<a href= "servlets/MyServletA"> This is an amazing servlet! </a>
		
	<BODY>

</HTML>



*/