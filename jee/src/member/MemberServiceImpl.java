package member;

import java.util.List;
import java.util.Map;

import bank.AccountService;
import bank.AccountServiceImpl;



public class MemberServiceImpl implements MemberService {
	MemberBean stu;
	

	MemberDAO dao = MemberDAO.getInstance();
	AccountService accService = AccountServiceImpl.getInstance();
	MemberBean session;
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
		
		int result = dao.insert(mem);
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
	public String update(MemberBean mem) {
		// TODO 3.수정
	    String result = "";
	    if (dao.update(mem) == 1) {
			result = "수정성공";
		} else {
            result = "수정실패";
		}
	    return result;
	}

	@Override
	public String delete(String id) {
		// TODO 4.삭제
		String result = "";
		if (dao.delete(id) == 1) {
			result = "삭제성공";
		} else {
            result = "삭제실패";
		}
		return  result;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return dao.count();
	}

	@Override
	public MemberBean findById(String findID) {
		return dao.findById(findID);
	}

	@Override
	public List<?> list() {
		
		return dao.list();
	}

	@Override
	public List<?> findBy(String findByName) {
		return dao.findByName(findByName);
	}

	@Override
	public Map<?, ?> map() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String login(MemberBean member) {
		// 2.로그인
		String result = "";
			if (dao.login(member)) {
				result = "로그인성공";
				session = findById(member.getId());
				accService.map();
			} else {
				result = "로그인실패";
			}
		return result;
	}

}
/*
 * String sqlCreate = "create table member(" + "id varchar2(20) primary key," +
 * "pw varchar2(20)," + "name varchar2(20)," + "reg_date varchar2(20)," +
 * "ssn varchar2(10)" + ")"; String sqlDrop = "drop table member";
 */