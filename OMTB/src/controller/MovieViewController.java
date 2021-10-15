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
@WebServlet("/ViewMovies")
public class MovieViewController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	protected void doGet (HttpServletRequest request, HttpServletResponse response) {
		doPost (request, response);
	}
	
	protected void doPost (HttpServletRequest request, HttpServletResponse response) {
		try {
			int id = Integer.parseInt(request.getParameter("id"));
			PrintWriter out = response.getWriter();
			List<OMTBBean> movies = OMTBDao.viewMovies(id);
			out.print("<table>");
			out.print("<table border='1' width='50%'");
			out.print("<tr><th>Movie ID</th><th>Movies</th><th>Select</th><th>Delete</th></tr>");
			for (OMTBBean omtbBean : movies){  
		         out.print("<tr><td>"+ omtbBean.getMovieId()+"</td><td>"+ omtbBean.getMovieName()+"</td><td><a href='ViewTheaters?id="+omtbBean.getMovieId()+"'>select</a></td><td><a href='DeleteMovie?id="+ omtbBean.getMovieId()+"'>remove</a></td></tr>");  
			}
			out.print("</table>");			
		}
		catch (IOException exception) {
			exception.printStackTrace();
		}
	}
}