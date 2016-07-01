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
    MemberService service = MemberServiceImpl.getInstance();
    int ok = 0;
		
		while (true) {
			switch (JOptionPane.showInputDialog("1.등록2.보기3.수정4.삭제0.종료")) {
			case "1":
				MemberBean stu = new MemberBean();
				String input =JOptionPane.showInputDialog("ID,PW,이름,주민번호");
				String[] inputArr = input.split(",");
				stu.setId(inputArr[0]);
				stu.setPw(inputArr[1]);
				stu.setName(inputArr[2]);
				stu.setSsn(inputArr[3]);
				stu.setRegDate();
				String result = service.regist(stu);
				JOptionPane.showMessageDialog(null, result);
				break;
			case "2":
				JOptionPane.showMessageDialog(null, service.show());
				break;
			case "3":
				String rpw = JOptionPane.showInputDialog("수정값?");
                service.update(rpw);
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
