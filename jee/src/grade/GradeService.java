package grade;

import java.util.List;

public interface GradeService {
	// 총 7개의 기본 패턴이 존재한다
	// exeU
	public int insert(GradeBean gra);
	public int update(GradeBean grade);
	public String delete(String id);
	// exeQ
	public List<GradeBean> list();
	public List<GradeBean> findByHakjum(String hakjum);
	public GradeBean findBySeq(int seq);
	public int count();
    // 점수입력받는 메소드
	public void score(String[]strArr);
	/*public abstract void jumsu(String name, int kor, int eng, int math);
	public int tatal();
	public int avg();
	public String grade();
	public String result();*/
}
