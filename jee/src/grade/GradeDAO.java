package grade;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class GradeDAO {
		
	private static GradeDAO instance = new GradeDAO(); 
			
	public static GradeDAO getInstance() {
		return instance;
	}
	private GradeDAO() {
		// TODO Auto-generated constructor stub
	}	
		
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    PreparedStatement pstmt = null;
    
}
