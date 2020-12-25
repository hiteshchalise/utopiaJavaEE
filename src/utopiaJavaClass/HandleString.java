package utopiaJavaClass;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HandleString extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		String original = req.getParameter("reverse");
		String reverse = "";
		
		for(int i=original.length(); i>0; i--) {
			reverse += original.charAt(i-1);
		}
		
		PrintWriter writer = res.getWriter();
		writer.println(reverse);
	}

}
