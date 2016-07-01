package member;

public class MemberServiceImpl implements MemberService {
	MemberBean stu;

	MemberDAO dao = MemberDAO.getInstance();

	private static MemberServiceImpl instance = new MemberServiceImpl();  //싱글턴 패턴(보안때문에 getter만 보유한패턴)

	public static MemberServiceImpl getInstance() {
		return instance;
	}

	private MemberServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String regist(MemberBean mem) {
		String msg = "";
		String sql ="insert into member(id,pw,name,reg_date,ssn)"+"values('"+mem.getId()+"','"+mem.getPw()+"','"+mem.getName()+"','"+mem.getRegDate()+"','"+mem.getSsn()+"')";
		int result = dao.exeUpdate(sql);
		if (result==1) {
			msg = "회원가입 축하";
		} else {
            msg = "회원가입 실패!";
		}
		return msg;
	}

	@Override
	public String show() {
		// TODO 2.보기
		return stu.toString();
	}

	@Override
	public void update(String pw) {
		// TODO 3.수정
		stu.setPw(pw);
	}

	@Override
	public void delete() {
		// TODO 4.삭제
		stu = null;
	}

}
/*
 * String sqlCreate = "create table member(" + "id varchar2(20) primary key," +
 * "pw varchar2(20)," + "name varchar2(20)," + "reg_date varchar2(20)," +
 * "ssn varchar2(10)" + ")"; String sqlDrop = "drop table member";
 */