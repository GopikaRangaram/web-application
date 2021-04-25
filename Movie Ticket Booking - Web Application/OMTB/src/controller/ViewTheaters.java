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

@WebServlet("/ViewTheaters")
public class ViewTheaters extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	protected void doGet (HttpServletRequest request, HttpServletResponse response) {
		doPost (request, response);
	}
	
	protected void doPost (HttpServletRequest request, HttpServletResponse response) {
		int id = Integer.parseInt(request.getParameter("id"));
		try {
			PrintWriter out = response.getWriter();
			List<OMTBBean> theaters = OMTBDao.viewTheaters(id);
			out.print("<table>");
			out.print("<table border='1' width='50%'");
			out.print("<tr><th>Theater ID</th><th>Theaters</th><th>Address</th><th>Ticket Fare</th><th>Select</th><th>Delete</th></tr>");
			for (OMTBBean omtbBean : theaters){  
				out.print("<tr><td>"+ omtbBean.getTheaterId()+"</td><td>"+ omtbBean.getTheaterName()+"</td><td>"+ omtbBean.getTheaterAddress()+"</td><td>"+ omtbBean.getFare()+"</td><td><a href='ViewTheaters?id="+omtbBean.getTheaterId()+"'>select</a></td><td><a href='DeleteTheater?id="+omtbBean.getTheaterId()+"'>delete</a></td></tr>");  
			}
			out.print("</table>");			
		}
		catch (IOException exception) {
			exception.printStackTrace();
		}
	}
}