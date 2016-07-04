package grade;

import java.util.List;

public interface GradeService {
	// 총 7개의 기본 패턴이 존재한다
	// exeU
	public int insert(GradeBean grade);
	public int update(GradeBean grade);
	public int delete(GradeBean grade);
	// exeQ
	public List<GradeBean> list();
	public List<GradeBean> findByHakjum(String hakjum);
	public GradeBean findBySeq(int seq);
	public int count();
	/*public abstract void jumsu(String name, int kor, int eng, int math);
	public int tatal();
	public int avg();
	public String grade();
	public String result();*/
}
