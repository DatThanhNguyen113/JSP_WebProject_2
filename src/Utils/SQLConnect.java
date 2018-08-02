package Utils;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnect {
	public static Connection getSQLServerConnection() throws ClassNotFoundException,SQLException {
		String hostName = "localhost";
		String sqlInstanceName = "SQLEXPRESS";
		String databaseName = "JSP_DoAn_DB";
		String userName = "";
		String passWord = "";
		return getSQLServerConnection(hostName,sqlInstanceName,databaseName,userName,passWord);
	}
	
	private static Connection getSQLServerConnection(
			String mHostName,
			String mSQLInstanceName,
			String mDatabaseName,
			String mUserName,
			String mPassWord) throws ClassNotFoundException,SQLException{
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String connectionSQL = "jdbc:sqlserver://" + mHostName+":1433;databasename="+mDatabaseName+";integratedSecurity=true";
		Connection conn = DriverManager.getConnection(connectionSQL,mUserName,mPassWord);
		return conn;
	}
}
