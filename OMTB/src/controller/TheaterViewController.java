package controller;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.OMTBBean;
import model.OMTBDao;
@WebServlet("/ViewTheaters")
public class TheaterViewController extends HttpServlet {
	//private static final long serialVersionUID = 1L;
	protected void doGet (HttpServletRequest request, HttpServletResponse response) {
		doPost (request, response);
		}
	protected void doPost (HttpServletRequest request, HttpServletResponse response) {
		int id = Integer.parseInt(request.getParameter("id"));
		try {
			List<OMTBBean> theaters = OMTBDao.viewTheaters(id);
			OMTBBean omtbBean = OMTBDao.getCast(id);
			PrintWriter out = response.getWriter();
		//	System.out.print(theaters.get(0).getTheaterName());
			request.setAttribute("theaters", theaters);
			request.setAttribute("Object", omtbBean);
		//	response.sendRedirect("Theater.jsp");
	    	RequestDispatcher requestDispatcher = request.getRequestDispatcher("Theater.jsp");
			requestDispatcher.forward(request, response);
//			out.print("<table>");
//			out.print("<table border='1' width='50%'");
//			out.print("<tr><th>Theater ID</th><th>Theater Name</th><th>Theater Address</th><th>Ticket Fare</th><th>Select</th><th>Delete</th></tr>");
//			for (OMTBBean omtbBean : theaters){  
//		         out.print("<tr><td>"+ omtbBean.getTheaterId()+"</td><td>"+ omtbBean.getTheaterName()+"</td><td>"+ omtbBean.getTheaterAddress()+"</td><td>"+ omtbBean.getFare()+"</td><td><a href='Theater.jsp'>select</a></td><td><a href='DeleteTheater?id="+ omtbBean.getTheaterId()+"'>remove</a></td></tr>");  
//			}
//			out.print("</table>");
		}
		catch (Exception exception ) {
			System.out.print(exception.getMessage());
		}}}