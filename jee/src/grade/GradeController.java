package grade;

import javax.swing.JOptionPane;

public class GradeController {
	public static void main(String[] args) {
		GradeService service = new GradeServiceImpl();
		while (true) {
			switch (JOptionPane.showInputDialog("1. 입력 2.조회 0.종료")) {
			case "1":
				String insert1 = JOptionPane.showInputDialog("이름,국어,영어,수학");
				String[] insert2 = insert1.split(",");
				service.jumsu(insert2[0], Integer.parseInt(insert2[1]), Integer.parseInt(insert2[2]),
						Integer.parseInt(insert2[3]));
				break;

			case "2":
				JOptionPane.showMessageDialog(null, service.result());
				break;
			case "0":
				return;

			}
		}
	}
}