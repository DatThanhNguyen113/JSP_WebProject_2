package Utils;


import java.sql.Connection;
import java.sql.SQLException;

import Beans.ResultMessage;

public class ConnectionUtils {
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
		return SQLConnect.getSQLServerConnection();
	}
	public static void closeConnection(Connection conn) throws SQLException {
		if(!conn.isClosed())
			conn.close();
	}
	public static void rollBackConnection(Connection conn) throws SQLException {
		if(!conn.isClosed())
			conn.rollback();
	}
	
	public static ResultMessage getResultMessage(int mID,String mCode , String mName , String mDescription) {
		ResultMessage result = new ResultMessage(mID,mCode,mName,mDescription);
		return result;
	}
	
}
