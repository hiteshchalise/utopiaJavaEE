package utopiaJavaClass;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HandleLoginServlet extends HttpServlet{
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		String username = req.getParameter("uname");
		String password = req.getParameter("pass");
		
		HttpSession session = req.getSession();
		session.setAttribute("usernamePass", username + "---" + password);
		
		PrintWriter writer = res.getWriter();
		
		res.setContentType("text/html");
		
		if(password.equals("chalise")) {
			RequestDispatcher rd = req.getRequestDispatcher("welcome");
			rd.forward(req, res);
		} else {
			writer.println("Password Failed.");
			RequestDispatcher rd = req.getRequestDispatcher("/index.html");
			rd.include(req, res);
		}
		
	}

}
