package grade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradeServiceImpl implements GradeService {
	GradeBean gra;
	
	GradeDAO dao = GradeDAO.getInstance();
	
	private static GradeServiceImpl instance = new GradeServiceImpl();
	
	public static GradeServiceImpl getInstance() {
		return instance;
	}

	private GradeServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int update(GradeBean grade) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String delete(String id) {
		// TODO Auto-generated method stub
		String result = "";
		if (dao.delete(id) == 1) {
			result = "삭제성공";
		} else {
            result = "삭제실패";
		}
		return  result;
	}

	@Override
	public List<GradeBean> list() {
		return dao.list();
	}

	@Override
	public List<GradeBean> findByHakjum(String hakjum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GradeBean findBySeq(int seq) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(GradeBean gra) {
		return 0;
	}

	@Override
	public void score(String[] a) {
		// id,date,java,sql,html,js
		GradeBean g = new GradeBean();
		g.setId(a[0]);
		g.setExamDate(a[1]);
		g.setJava(Integer.parseInt(a[2]));
		g.setSql(Integer.parseInt(a[3]));
		g.setHtml(Integer.parseInt(a[4]));
		g.setJavascript(Integer.parseInt(a[5]));
		this.insert(g);
	}
}