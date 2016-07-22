package member;

import java.util.List;

import global.CommonService;

/**
 * @date : 2016. 6. 17.
 * @author : 한상호
 * @file : StudentService.java
 * @story :
 */
public interface MemberService extends CommonService{
	public String regist(MemberBean mem);
	public String show();
	public void update(MemberBean stu2);
	public String delete(MemberBean member);
	public MemberBean findById(String findID);
	public String login(MemberBean member); 
	public MemberBean getSession();
	public void logout(MemberBean member);
}
