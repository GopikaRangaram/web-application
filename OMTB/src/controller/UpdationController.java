package controller;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.LoginBean;
import model.LoginDao;
@WebServlet("/Update")
public class UpdationController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	String emailId,password,oldPassword;
	public void doPost(HttpServletRequest request,HttpServletResponse response)
	{
		try
		{
			emailId = request.getParameter("emailId");
			oldPassword=request.getParameter("oldPassword");
			password = request.getParameter("password");
			LoginBean loginBean = new LoginBean();
			loginBean.setEmailId(emailId);
			loginBean.setPassword(oldPassword);
			System.out.println(emailId+" "+oldPassword+" "+password);
			int status = LoginDao.authenticateLogin(loginBean);
			System.out.print("status is "+ status);
			if(status == 2)
			{
				int statusCheck=LoginDao.changePassword(loginBean);
				if(statusCheck==0)
				{
					System.out.println("Password updation is not successful");
				}
			}
		}
		catch(Exception servletException)
		{
			
		}
	}
}