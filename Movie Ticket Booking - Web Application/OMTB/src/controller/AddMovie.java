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

@WebServlet("/AddMovie")
public class AddMovie extends HttpServlet {

	private static final long serialVersionUID = 1L;
	int cityId, status = 0;
	String movieName;
	
	protected void doGet (HttpServletRequest request, HttpServletResponse response) {
		doPost (request, response);
	}
	
	protected void doPost (HttpServletRequest request, HttpServletResponse response) {
		try {
			cityId = Integer.parseInt(request.getParameter("cityId"));
			movieName = request.getParameter("movieName");
			OMTBBean omtbBean = new OMTBBean();
			omtbBean.setCityId(cityId);
			omtbBean.setMovieName(movieName);
			status = OMTBDao.insertMovie(omtbBean);
			PrintWriter out = response.getWriter();
			if (status == 0) {
				out.print("No details stored");
			}
			else {
				out.print("<p>Record saved successfully!</p>");  
				request.getRequestDispatcher("Movie Registration.jsp").include(request, response); 
			}
		}
		catch (IOException | ServletException exception) {
			exception.printStackTrace();
		}
	}
}