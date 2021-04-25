package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.OMTBDao;

@WebServlet("/DeleteCity")
public class DeleteCity extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	protected void doGet (HttpServletRequest request, HttpServletResponse response) {
		doPost (request, response);
	}
	
	protected void doPost (HttpServletRequest request, HttpServletResponse response) {
			int status;
			int id = Integer.parseInt(request.getParameter("id"));
			try {
				status = OMTBDao.deleteCity(id);
				PrintWriter out = response.getWriter();
				 if (status > 0) {  
			            response.sendRedirect("ViewCities");  
			     }
				 else {  
			            out.println("Sorry! unable to delete record");  
			     }  
			} 
			catch (IOException exception) {
				exception.printStackTrace();
			}
	}
}
