package member;

/**
 * @date : 2016. 6. 17.
 * @author : 한상호
 * @file : StudentService.java
 * @story :
 */
public interface MemberService {
	public String regist(MemberBean mem);
	public String show();
	public void update(String pw);
	public void delete(); 
}
