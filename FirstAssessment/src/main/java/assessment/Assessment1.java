package assessment;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Assessment1")
public class Assessment1 extends HttpServlet {
public  void service(HttpServletRequest req,HttpServletResponse res) {
	try {
		res.sendRedirect("/FirstAssessment/asses1.html");
	} catch (Exception e) {
		// TODO: handle exception
	}
}

}
