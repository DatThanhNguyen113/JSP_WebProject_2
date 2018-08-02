package Servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Beans.ResultMessage;
import Beans.UserAccount;
import Beans.UserInfo;
import Utils.ClientUtils;
import Utils.ConnectionUtils;
import Utils.DBUtils;

@WebServlet(urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/Login/login.html");
		dispatcher.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String mUserName = req.getParameter("UserName");
		String mPassWord = req.getParameter("PassWord");
		try {
			Connection conn = ConnectionUtils.getConnection();
			DBUtils utils = new DBUtils();
			UserAccount item = new UserAccount();
			item.setUserName(mUserName);
			item.setPassWord(mPassWord);
			UserInfo isLoginSuccess = utils.CheckLogin(conn,item);
			if(isLoginSuccess != null) {
				
				ClientUtils.storeUserCookie(resp, isLoginSuccess);
				
				resp.sendRedirect("home");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
