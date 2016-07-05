package grade;

import javax.swing.JOptionPane;

public class GradeController {
	/**
	 *  클라이언트에서 프로그램 개발 요청이 왔습니다. 
	 * 이름과 국,영,수 세과목점수를 입력받아서() [홍길동 : 총점 ***점,
	 * 평균***점,학점 : F] 을 출력하는 프로그램을 만들어 주세요. 단) 평균은 소수점이하는 절삭합니다 평균점수가 90점 이상 A
	 * 80점 이상이면 B 70점 이상이면 C 60점 이상이면 D 50점 이상이면 E 50점 미만이면 F 학점입니다라고 출력되게 해주세요
	 * [단]switch-case 문으로 해결하세요.
	 * */
	public static void main(String[] args) {
		GradeService service = GradeServiceImpl.getInstance();
		while (true) {
			switch (JOptionPane.showInputDialog(""
					+ "1추가 2수정 3삭제 4전체조회 5학점을 포함한 시험내역 조회(SEQ) 6시퀀스조회(ID) 7응시생수(시험일자별)")) {
			case "1":
			    service.score(JOptionPane.showInputDialog("id,date,java,sql,html,js").split(","));
				break;
			case "2":
				GradeBean gra2 = new GradeBean();
				String input2 =JOptionPane.showInputDialog("점수변경 자바,SQL,HTML,자바스크립트");
				String[] inputArr2 = input2.split(",");
				gra2.setJava(Integer.parseInt(inputArr2[0]));
				gra2.setSql(Integer.parseInt(inputArr2[1]));
				gra2.setHtml(Integer.parseInt(inputArr2[2]));
				gra2.setJavascript(Integer.parseInt(inputArr2[3]));
				int result2 = service.update(gra2);
				JOptionPane.showMessageDialog(null, result2);
				break;
			case "3":
				String result3 = service.delete(JOptionPane.showInputDialog("삭제하려는 ID?"));
				JOptionPane.showMessageDialog(null, result3);
				break;
			case "4":
				JOptionPane.showMessageDialog(null, service.list());
				break;
			case "5":break;
			case "6":break;
			case "7":break;
			case "0":return;
			default:
				break;
			}
		}
}
}