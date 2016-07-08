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
	public String update(MemberBean stu2);
	public String delete(String id);
	public MemberBean findById(String findID);
	public String login(MemberBean member); 
}
