package Servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Beans.ProductType;
import Utils.ConnectionUtils;
import Utils.DBUtils;

@WebServlet(urlPatterns = {"/producttype"}, initParams= {
		@WebInitParam(name ="id", value = "")
})
public class ProductTypeServlet extends HttpServlet{
	private int CataloguryID;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.CataloguryID = Integer.parseInt(req.getParameter("id"));
		try {
			Connection conn = ConnectionUtils.getConnection();
			DBUtils util = new DBUtils();
			List<ProductType> listItem = util.ListProductType(conn); 
			req.setAttribute("listProductType", listItem.stream().filter(s -> s.getID() == CataloguryID) .collect(Collectors.toList()));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/ProductType/producttype.jsp");
		dispatcher.forward(req, resp);
	}

}
