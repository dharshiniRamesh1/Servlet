package project;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Loginpage")
public class Loginpage extends HttpServlet {
	
	Connection con;
	PreparedStatement  ps1;
	ResultSet rs;
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		PrintWriter pw=res.getWriter();
		
		String user =req.getParameter("username");
		
		String pds =req.getParameter("password");
		
		String str1 = "SELECT * FROM  login where username=? and password=?";
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
			ps1=con.prepareStatement(str1);
			ps1.setString(1,user);
			ps1.setString(2, pds);
			rs=ps1.executeQuery();
				
		RequestDispatcher rq=req.getRequestDispatcher("general.html");
		rq.include(req, res);
		
		if(rs.next())  {
			HttpSession hsp=req.getSession();
			hsp.setAttribute("un", user);
			pw=res.getWriter();
			pw.print("login successfully!......");
			RequestDispatcher rds=req.getRequestDispatcher("General");
			rds.forward(req, res);
			
		}
		else {
			RequestDispatcher rd=req.getRequestDispatcher("login.html");
			rd.forward(req, res);
			
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

}
}
