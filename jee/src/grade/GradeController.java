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
					+ "1추가 2수정 3삭제 4전체조회 5학점을 포함한 시험내역 조회(SEQ) 6시퀀스조회(ID) 7응시생수(시험일자별) 0종료")) {
			case "1":
				GradeBean bean = new GradeBean();
				String insert = JOptionPane.showInputDialog("ID와 점수, 날짜를 입력해주세요\n"
						+ "ID, java, sql, html, javascript, exam_date");
				String[] insert2 = insert.split(",");
				bean.setId(insert2[0]);
				bean.setJava(Integer.parseInt(insert2[1]));
				bean.setSql(Integer.parseInt(insert2[2]));
				bean.setHtml(Integer.parseInt(insert2[3]));
				bean.setJavascript(Integer.parseInt(insert2[4]));
				bean.setExamDate(insert2[5]);
				JOptionPane.showMessageDialog(null, service.insert(bean));
				break;
			case "2":
				GradeBean bean2 = new GradeBean();
				String modify = JOptionPane.showInputDialog("수정하실 Seq_no 및 과목, 점수를 입력하세요");
				String[] modify2 = modify.split(",");
				bean2.setSeq(modify2[0]);
				bean2.setType(modify2[1]);
				bean2.setScore(modify2[2]);
				JOptionPane.showMessageDialog(null, service.update(bean2));
				break;
			case "3":
				String result3 = service.delete(JOptionPane.showInputDialog("삭제하려는 ID?"));
				JOptionPane.showMessageDialog(null, result3);
				break;
			case "4":
				GradeUI ui = new GradeUI();
				break;
			case "5":
				String findBySq = JOptionPane.showInputDialog("조회하실 Seq.no");
				JOptionPane.showMessageDialog(null, service.findBySeq(Integer.parseInt(findBySq)));
				break;
			case "6":
				String findByName = JOptionPane.showInputDialog("조회하실 ID");
				JOptionPane.showMessageDialog(null, service.findBy(findByName));
				break;
			case "7":
			String examDate = JOptionPane.showInputDialog("조회하려는 시험일자(예:2016-05");
				JOptionPane.showMessageDialog(null, service.count(examDate)+"명");
				break;
			case "0":return;
			default:
				break;
			}
		}
}
}