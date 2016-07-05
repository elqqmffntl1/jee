package grade;

public class GradeBean{
	private String id,grade,seq,examDate;
	private int java,sql,html,javascript;
	
	public GradeBean(){}
	
	public GradeBean(String seq, String grade, int java, int sql, int html, int javascript,
			String id, String examDate) {
		this.seq = seq;
		this.grade = grade;
		this.java = java;
		this.sql = sql;
		this.html = html;
		this.javascript = javascript;
		this.id = id;
		this.examDate = examDate;
	}
	public String getExamDate() {
		return examDate;
	}

	public void setExamDate(String examDate) {
		this.examDate = examDate;
	}

	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public int getSql() {
		return sql;
	}
	public void setSql(int sql) {
		this.sql = sql;
	}
	public int getHtml() {
		return html;
	}
	public void setHtml(int html) {
		this.html = html;
	}
	public int getJavascript() {
		return javascript;
	}
	public void setJavascript(int javascript) {
		this.javascript = javascript;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(){
		String result = "";
		this.grade = result;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "성적표 [No." + seq + ",아이디=" + id + ", 학점=" + grade + "\n" 
				       + "  자바:" + java + ", SQL=" + sql
			       	   + ", HTML5:" + html + ", 자바스크립트:" + javascript + "]";
	}

	
	
}