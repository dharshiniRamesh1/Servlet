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

/**
 * Servlet implementation class GeneralStudentpage
 */
@WebServlet("/GeneralStudentpage")
public class GeneralStudentpage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		
		//RequestDispatcher rd=req.getRequestDispatcher("general.html");
		//rd.include(req, res);
		HttpSession sd=req.getSession();
		String name ="select sname from studentmark where email=?";
		 //String name=(String)sd.getAttribute("un");
		if(name==null) {
		 RequestDispatcher rs1=req.getRequestDispatcher("studentloginpage.html");
		 rs1.include(req, res);
		
		}
		else {
			 pw.println("Welcome " +name);
		
		}
		
	}

}
