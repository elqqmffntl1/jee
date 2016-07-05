package grade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import global.Constants;
import global.DatabaseFactory;
import global.Vendor;


public class GradeDAO {
	   Connection con;
	   Statement stmt;
	   ResultSet rs;
	   PreparedStatement pstmt;
		
	private static GradeDAO instance = new GradeDAO(); 
			
	public static GradeDAO getInstance() {
		return instance;
	}
	private GradeDAO() {
		con = DatabaseFactory
				.createDatabase(Vendor.ORACLE,
				Constants.USER_ID,
				Constants.USER_PW)
				.getConnection();
	}	
    
	public int insert(GradeBean g) {
		int result = 0;
		String sql="insert into grade(seq,grade,java,sql,html,javascript,id,exam_date)"
				+ "values(seq.nextval,?,?,?,?,?,?,?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, g.getGrade());
			pstmt.setInt(2, g.getJava());
			pstmt.setInt(3, g.getSql());
			pstmt.setInt(4, g.getHtml());
			pstmt.setInt(5, g.getJavascript());
			pstmt.setString(6, g.getId());
			pstmt.setString(7, g.getExamDate());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	public int delete(String id) {
		// TODO Auto-generated method stub
		String sql = "delete from grade where seq = '"+id+"'";
    	return 0;
	}

	public List<GradeBean> list() {
		String sql = "select * from grade";
		List<GradeBean> list = new ArrayList<GradeBean>();
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			con = DriverManager.getConnection(Constants.ORACLE_URL,Constants.USER_ID,Constants.USER_PW);
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				GradeBean g = new GradeBean(
						rs.getString("seq"),
						rs.getString("grade"),
						rs.getInt("java"),
						rs.getInt("sql"),
						rs.getInt("html"),
						rs.getInt("javascript"),
						rs.getString("id"),
						rs.getString("exam_date"));
				list.add(g);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
    
}
