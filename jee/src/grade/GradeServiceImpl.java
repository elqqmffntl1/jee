package grade;

public class GradeServiceImpl implements GradeService {
    GradeBean gra;

	@Override
	public void jumsu(String name, int kor, int eng, int math) {
		gra = new GradeBean(name, kor, eng, math);
	}

	@Override
	public int tatal() {
		return gra.getKor() + gra.getEng() + gra.getMath();
	}

	@Override
	public int avg() {
		return tatal()/3;
	}

	@Override
	public String grade() {
		String result = "";
		switch (avg()/10) {
		case 9:
			result = "A";
			break;
		case 8:
			result = "B";
			break;
		case 7:
			result = "C";
			break;
		case 6:
			result = "D";
            break;
		case 5:
			result = "E";
			break;
		default:
			result = "F";
			break;
		}
		return result;
	}

	@Override
	public String result() {
		return "총점:"+tatal()+"평균:"+avg()+"학점:"+grade();
	}
}