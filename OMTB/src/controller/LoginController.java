package controller;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.LoginBean;
import model.LoginDao;
@WebServlet("/Login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String emailId, password;
	public void doPost (HttpServletRequest request, HttpServletResponse response) {
		try {
			emailId = request.getParameter("emailId");
			password = request.getParameter("password");
			if (emailId.equals("admin@gmail.com") && password.equals("admin123")) {
				response.sendRedirect("City Registration.jsp");
			}
			else {
				LoginBean loginBean = new LoginBean();
				loginBean.setEmailId(emailId);
				loginBean.setPassword(password);
				int status = LoginDao.authenticateLogin(loginBean);
				System.out.print(status);
				String error="";
				if (status == 0) {
					error="Sorry! You are not registered in this application";
					HttpSession session = request.getSession();
					session.setAttribute("status", error);
					response.sendRedirect("index.jsp");
				}
				if(status == 2)
				{
					 error="Invalid password";
					 HttpSession session = request.getSession();
					 session.setAttribute("status", error);
					 response.sendRedirect("index.jsp");	
				}
				else
				{
					 response.sendRedirect("index.jsp");
				}
				
			}
		}
		catch (IOException exception) {
			exception.printStackTrace();
		}
	}
}