package member;

import javax.swing.JOptionPane;

/**
 * @date : 2016. 6. 16.
 * @author : 한상호
 * @file : SchoolController.java
 * @story :
 */
public class MemberController {
	public static void main(String[] args) { // String[] params
    MemberService service = new MemberServiceImpl();
    int ok = 0;
		
		while (true) {
			switch (JOptionPane.showInputDialog("1.등록2.보기3.수정4.삭제0.종료")) {
			case "1":
				String stu1 =JOptionPane.showInputDialog("ID,PW,이름,주민번호");
				String[] stuArr = stu1.split(",");
				service.registStudent(stuArr[0], stuArr[1], stuArr[2], stuArr[3]);
				break;
			case "2":
				JOptionPane.showMessageDialog(null, service.showStudent());
				break;
			case "3":
				String rpw = JOptionPane.showInputDialog("수정값?");
                service.updateStudent(rpw);
                break;
			case "4":
				break;
			case "0":
				ok = JOptionPane.showConfirmDialog(null, "Close OK?");
				if (ok == 0) {
					return;
				} else {
					continue;
				}
				
			default:
				return;
			}
		}
	}
}
