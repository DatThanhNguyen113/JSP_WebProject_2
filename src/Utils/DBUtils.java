package Utils;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Beans.Cataloguries;
import Beans.ProductType;
import Beans.ResultMessage;
import Beans.UserAccount;
import Beans.UserInfo;


public class DBUtils {
	public DBUtils() {
	}
	
	public UserInfo CheckLogin(Connection conn,UserAccount item) throws SQLException {
		UserInfo model = new UserInfo();
		try {
			String query = String.format("Exec [dbo].[MasterFunction] 1, '<InputValue Sys_ViewID= \"4\" /><RequestParams Sys_ViewID=\"4\" UserName=\"%s\" Password=\"%s\" />'", item.getUserName(),item.getPassWord());
			PreparedStatement statement = conn.prepareStatement(query);
			boolean results = statement.execute();
			int count = 0;
			ResultMessage message = null;
	        do {
	            if (results) {
	                ResultSet rs = statement.getResultSet();
	                while (rs.next()) {
	                	count ++;
	                	if(count == 2) {
	                		message = ConnectionUtils.getResultMessage(rs.getInt("ID"),rs.getString("Code"),rs.getString("Name"),rs.getString("Description"));
	                		
	                	}
	                	if(count >= 2 ) {
	                		
	                		if(count == 3 && message.getID() > 0) {
	                			model.setUserID(rs.getInt("ID"));
		                		model.setUserName(rs.getString("UserName"));
		                		try {
		                			model.setFullName(rs.getString("FullName"));
		                		}
		                		catch(Exception ex) {
		                			model.setFullName(rs.getString(""));
		                		}
		                		try {
		                			model.setEmail(rs.getString("Email"));
		                		}
		                		catch(Exception ex) {
		                			model.setEmail(rs.getString(""));
		                		}
		                		try {
		                			model.setPhone(rs.getString("Phone"));
		                		}
		                		catch(Exception ex) {
		                			model.setPhone(rs.getString(""));
		                		}
	                		}

	                	}	                	
	                }
	            }
	            results = statement.getMoreResults(statement.CLOSE_CURRENT_RESULT);
	        } while (results);
	        statement.close();
	        return model;
		}
		catch(Exception ex) {}
		return null;
	}
	
	public static List<Cataloguries> ListCataloguries(Connection conn){
		List<Cataloguries> listItem = new ArrayList<>();
		try {
			String query = "Exec [dbo].[MasterFunction] 1,'<InputValue Sys_ViewID=\"1\"/><RequestParams Sys_ViewID=\"1\" Contex=\"GetCataloguries\"/>'";
			PreparedStatement statement = conn.prepareStatement(query);
			boolean results = statement.execute();
			int count = 0;
			ResultMessage message = null;
	        do {
	            if (results) {
	                ResultSet rs = statement.getResultSet();
	                while (rs.next()) {
	                	count ++;
	                	if(count == 1) {
	                		message = ConnectionUtils.getResultMessage(rs.getInt("ID"),rs.getString("Code"),rs.getString("Name"),rs.getString("Description"));
	                		
	                	}
	                	if(count >= 1 ) {	                		
	                		if(count >= 2 && message.getID() > 0) {
	                			Cataloguries model = new Cataloguries();
	                			model.setID(rs.getInt("ID"));
		                		model.setTypeName(rs.getString("TypeName"));
		                		listItem.add(model);
	                		}
	                	}	                	
	                }
	            }
	            results = statement.getMoreResults(statement.CLOSE_CURRENT_RESULT);
	        } while (results);
	        statement.close();
	        return listItem;
		}
		catch(Exception ex) {}
		return null;
	}
	
	public static List<ProductType> ListProductType(Connection conn){
		List<ProductType> listItem = new ArrayList<>();
		try {
			String query = "Exec [dbo].[MasterFunction] 1,'<InputValue Sys_ViewID=\"1\"/><RequestParams Sys_ViewID=\"1\" Contex=\"GetProductType\"/>'";
			PreparedStatement statement = conn.prepareStatement(query);
			boolean results = statement.execute();
			int count = 0;
			ResultMessage message = null;
	        do {
	            if (results) {
	                ResultSet rs = statement.getResultSet();
	                while (rs.next()) {
	                	count ++;
	                	if(count == 1) {
	                		message = ConnectionUtils.getResultMessage(rs.getInt("ID"),rs.getString("Code"),rs.getString("Name"),rs.getString("Description"));
	                		
	                	}
	                	if(count >= 1 ) {	                		
	                		if(count >= 2 && message.getID() > 0) {
	                			ProductType model = new ProductType();
	                			model.setID(rs.getInt("ID"));
		                		model.setName(rs.getString("Name"));
		                		model.setCataloguryID(rs.getInt("CataloguriesID"));
		                		model.setImage(rs.getString("Image"));
		                		listItem.add(model);
	                		}
	                	}	                	
	                }
	            }
	            results = statement.getMoreResults(statement.CLOSE_CURRENT_RESULT);
	        } while (results);
	        statement.close();
	        return listItem;
		}
		catch(Exception ex) {}
		return null;
	}
}
