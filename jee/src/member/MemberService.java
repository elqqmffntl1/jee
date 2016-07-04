package member;

import java.util.List;

/**
 * @date : 2016. 6. 17.
 * @author : 한상호
 * @file : StudentService.java
 * @story :
 */
public interface MemberService {
	public String regist(MemberBean mem);
	public String show();
	public String update(MemberBean stu2);
	public String delete(String id);
	public int count();
	public MemberBean findById(String findID);
	public List<MemberBean> list();
	public List<MemberBean> findByName(String findName);
}
