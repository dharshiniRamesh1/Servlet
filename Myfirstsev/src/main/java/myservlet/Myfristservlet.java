package myservlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Myfristservlet")
public class Myfristservlet extends HttpServlet {
	
	public void service(HttpServletRequest req,HttpServletResponse res) {
		try {
			res.sendRedirect("/Myfirstsev/sv.html");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
			
	}

}
