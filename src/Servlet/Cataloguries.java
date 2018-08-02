package Servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Utils.ConnectionUtils;
import Utils.DBUtils;

@WebServlet(urlPatterns = {"/cataloguries"})
public class Cataloguries extends HomeServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connection conn;
		try {
			conn = ConnectionUtils.getConnection();
			List<Beans.Cataloguries> listItem = DBUtils.ListCataloguries(conn);
			req.setAttribute("listCataloguries", listItem);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/Cataloguries/Cataloguries.jsp");
		dispatcher.forward(req, resp);
	}
	

}
