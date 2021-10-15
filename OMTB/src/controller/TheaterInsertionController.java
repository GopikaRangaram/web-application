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
@WebServlet("/AddTheater")
public class TheaterInsertionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int movieId, status, numberOfSeats = 0;
	String theaterName, theaterAddress, movieStartDate, movieEndDate, showTime;
	float fare;
	protected void doGet (HttpServletRequest request, HttpServletResponse response) {
		doPost (request, response);
	}
	protected void doPost (HttpServletRequest request, HttpServletResponse response) {
		try {
			movieId = Integer.parseInt(request.getParameter("movieId"));
			theaterName = request.getParameter("theaterName");
			theaterAddress = request.getParameter("address");
			fare = Float.parseFloat(request.getParameter("fare"));
			numberOfSeats= Integer.parseInt(request.getParameter("numberOfSeats"));
			movieStartDate = request.getParameter("start date");
			movieEndDate = request.getParameter("end date");
			showTime = request.getParameter("showTime");
			OMTBBean omtbBean = new OMTBBean();
			omtbBean.setMovieId(movieId);
			omtbBean.setTheaterName(theaterName);
			omtbBean.setTheaterAddress(theaterAddress);
			omtbBean.setFare(fare);
			omtbBean.setNumberOfSeats(numberOfSeats);
			omtbBean.setMovieStartDate(movieStartDate);
			omtbBean.setMovieEndDate(movieEndDate);
			omtbBean.setShowTime(showTime);
			status = OMTBDao.insertTheater(omtbBean);
			PrintWriter out = response.getWriter();
			if (status == 0) {
				out.print("No details stored");
			}
			else {
				out.print("<p>Record saved successfully!</p>");  
				request.getRequestDispatcher("Theater Registration.jsp").include(request, response);
			}
		}
		catch (IOException | ServletException exception) {
			exception.printStackTrace();
		}}}