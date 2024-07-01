package controler;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.palinrome;

@WebServlet("/servcontrol")
public class servcontrol extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int num=Integer.parseInt(req.getParameter("f1"));
		boolean check=palinrome.checkpali(num);
		int a=1;
		int b=2;
		if(check) {
			HttpSession htp=req.getSession();
			htp.setAttribute("b1", a);
		}
		RequestDispatcher rd=req.getRequestDispatcher("validate.jps");
		rd.forward(req,res);
		
	}

}
