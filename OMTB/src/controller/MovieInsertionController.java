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
public class MovieInsertionController extends HttpServlet {

private static final long serialVersionUID = 1L;
int status = 0;
protected void doGet (HttpServletRequest request, HttpServletResponse response) {
doPost (request, response);
}
protected void doPost (HttpServletRequest request, HttpServletResponse response) {
try {
OMTBBean omtbBean = new OMTBBean();
omtbBean.setCityId(Integer.parseInt(request.getParameter("cityId")));
omtbBean.setMovieName(request.getParameter("movieName"));
omtbBean.setPosterLink(request.getParameter("posterLink"));
omtbBean.setCast1(request.getParameter("cast1"));
omtbBean.setCastImage1(request.getParameter("cast1Image"));
omtbBean.setCast2(request.getParameter("cast2"));
omtbBean.setCastImage2(request.getParameter("cast2Image"));
omtbBean.setCast3(request.getParameter("cast3"));
omtbBean.setCastImage3(request.getParameter("cast3Image"));
omtbBean.setCast4(request.getParameter("cast4"));
omtbBean.setCastImage4(request.getParameter("cast4Image"));
omtbBean.setCast5(request.getParameter("cast5"));
omtbBean.setCastImage5(request.getParameter("cast5Image"));
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