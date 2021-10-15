package controller;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.LoginBean;
import model.LoginDao;
@WebServlet("/Register")
public class RegistrationController extends HttpServlet {
	//private static final long serialVersionUID = 1L;
	String userName, emailId, password, mobileNumber;
	public void doPost (HttpServletRequest request, HttpServletResponse response) {
		try {
			userName = request.getParameter("userName");
			emailId = request.getParameter("emailId");
			password = request.getParameter("password");
			mobileNumber = request.getParameter("mobileNumber");
			LoginBean loginBean = new LoginBean();
			loginBean.setUserName(userName);
			loginBean.setEmailId(emailId);
			loginBean.setPassword(password);
			loginBean.setMobileNumber(mobileNumber);
			int status = LoginDao.registerUser(loginBean);
			PrintWriter printWriter = response.getWriter();
			String error="";
			System.out.print(status);
			if (status == 2) { 
				 error="User already exisits";
				 HttpSession session = request.getSession();
				 session.setAttribute("status", error);
				 response.sendRedirect("index.jsp");
			}
			else 
			{
				response.sendRedirect("index.jsp");
			}
		}
		catch (IOException exception) {
			exception.printStackTrace();
		}
	}
}