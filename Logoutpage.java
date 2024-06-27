package project;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Logoutpage")
public class Logoutpage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw;
	    pw=res.getWriter();
		RequestDispatcher rd=req.getRequestDispatcher("general.html");
		rd.include(req, res);
		HttpSession	 hp=req.getSession();
		hp.invalidate();
        pw.println("loggedout successfully!........");
	
	
	
	
	
	}

}
