

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Asses")
public class Asses extends HttpServlet {
	public void Server(HttpServletRequest req , HttpServletResponse res) {
		try {
			res.sendRedirect("/Assement/asses.html");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
