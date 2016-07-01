package grade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import global.Constants;

public class GradeDAO {
	public static void main(String[] args) {
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    int updateResult = 0;
    String sqlcreate = "create table grade("
    		+ "name varchar2(20),"
    		+ "kor int,"
    		+ "eng int,"
    		+ "math int)";
    String sqlDrop = "drop table grade";
    
    try {
		Class.forName(Constants.ORACLE_DRIVER);
		con = DriverManager.getConnection(
				Constants.ORACLE_URL,
				Constants.ORACLE_ID,
				Constants.ORACLE_PW
				);
		stmt = con.createStatement();
		updateResult = stmt.executeUpdate(sqlDrop);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      System.out.println("DB에 다녀온결과:"+updateResult);
	}
}
