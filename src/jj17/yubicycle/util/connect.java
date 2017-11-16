package jj17.yubicycle.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connect {
	/**
	 * DB연결은 반드시 이걸 거칠 것.
	 * @param		none
	 * @return		if (success) returns Connection value,
	 * 				else returns null
	 */
	public static Connection connectToDB() {
		Connection c = null;
		
		try {
		
			String url	=	"jdbc:mysql://alsdn.iptime.org:6033/yubikeDB";
			String multipleQueryOptions =
							"?allowMultiQueries=true";
			String id	=	"yubike";
			String pw	=	"tjdgh123";
			
			c = DriverManager.getConnection(
					url+multipleQueryOptions,
					id,
					pw);
			
			System.out.println("[0] connection successful");
		
		} catch (SQLException se) {
			se.printStackTrace();
			return null;
		}
		
		return c;
	}
}