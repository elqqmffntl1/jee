package grade;

public interface GradeService {
	public abstract void jumsu(String name, int kor, int eng, int math);
	public int tatal();
	public int avg();
	public String grade();
	public String result();
}
