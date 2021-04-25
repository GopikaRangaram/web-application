package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.OMTBBean;
import model.OMTBDao;

@WebServlet("/ViewCities")
public class ViewCities extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	protected void doGet (HttpServletRequest request, HttpServletResponse response) {
		doPost (request, response);
	}
	
	protected void doPost (HttpServletRequest request, HttpServletResponse response) {
		try {
			PrintWriter out = response.getWriter();
			List<OMTBBean> cities = OMTBDao.viewCities();
			out.println("<a href='Movie Registration.jsp'>Add Movie</a><br/>");
			out.print("<table>");
			out.print("<table border='1' width='50%'");
			out.print("<tr><th>City ID</th><th>City</th><th>Select</th><th>Delete</th></tr>");
			for (OMTBBean omtbBean : cities){  
		         out.print("<tr><td>"+ omtbBean.getCityId()+"</td><td>"+ omtbBean.getCityName()+"</td><td><a href='ViewMovies?id="+omtbBean.getCityId()+"'>select</a></td><td><a href='DeleteCity?id="+ omtbBean.getCityId()+"'>remove</a></td></tr>");  
			}
			out.print("</table>");			
		}
		catch (IOException exception) {
			exception.printStackTrace();
		}
	}
}
