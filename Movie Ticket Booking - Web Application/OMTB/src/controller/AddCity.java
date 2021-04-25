package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.OMTBBean;
import model.OMTBDao;

@WebServlet("/AddCity")
public class AddCity extends HttpServlet {

	private static final long serialVersionUID = 1L;
	int status = 0;
	String cityName;
	
	public void doPost (HttpServletRequest request, HttpServletResponse response) {
		try {
			cityName = request.getParameter("cityName");
			OMTBBean omtbBean = new OMTBBean();
			omtbBean.setCityName(cityName);
			status = OMTBDao.insertCity(omtbBean);
			PrintWriter out = response.getWriter();
			if (status == 0) {
				out.print("No details stored");
			}
			else {
				out.print("<p>Record saved successfully!</p>");  
				request.getRequestDispatcher("City Registration.jsp").include(request, response);
			}
		}
		catch (IOException | ServletException exception) {
			exception.printStackTrace();
		}
	}
}
