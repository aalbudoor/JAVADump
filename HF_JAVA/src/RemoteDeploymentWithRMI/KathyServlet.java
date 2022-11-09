package RemoteDeploymentWithRMI;
//Just for fun, make the Phrase-O_matic work as a servlet

//java code can call java code from other classes. so a servlet is free to call a method on the Phrase-O-Matic.
//all you have to do is drop the Phrase-O-Matic class into the same directory as your servlet

import java.io.*;
import javax.servlet.http.*;

public class KathyServlet extends HttpServlet{
	
	public void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String title = "PhraseOMatic has generated the following phrase.";
		
		response.setContent("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<HTML><HEAD><TITLE>");
		out.println("PhraseOmatic");
		out.println("</TITLE></HEAD><BODY>");
		out.println("<H1>" + title + "</H1>");
		out.println("<P>" + PhraseOMatic.makePhrase()); //see! your servlet can call methods on another class in this case calling makePhrase() method
		out.println("<P> <a href=\"KathySevlet\" make another phrase </a></p>");
		out.println("</BODY></HTML>");
		
		out.close();
		

	}
}