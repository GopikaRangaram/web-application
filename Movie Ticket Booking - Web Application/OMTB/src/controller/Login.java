package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import model.LoginBean;
import model.LoginDao;

@WebServlet("/SignIn")
public class Login extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	String emailId, password;
	private Logger logger = null;
	
	public void init() {
		logger = Logger.getRootLogger();
	}
	
	public void doPost (HttpServletRequest request, HttpServletResponse response) {
		logger.debug("logging into DEBUG message");
		logger.info("logging into INFO message");
		logger.warn("logging into WARN message");
		logger.error("logging into ERROR message");
		logger.fatal("logging into FATAL ERROR message");
		
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
				PrintWriter printWriter = response.getWriter();
				if (status == 0) {
					printWriter.print("Sorry! You are not registered in this application");
					RequestDispatcher requestDispatcher = request.getRequestDispatcher("Register.html");
					requestDispatcher.include(request, response);
				}
				else if (status == -1) {
					printWriter.print("Password is wrong");
				}
				else {
					printWriter.print("Welcome!!!");
				}
			}
		}
		catch (IOException | ServletException exception) {
			exception.printStackTrace();
		}
	}
}