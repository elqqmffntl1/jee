package member;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import global.Command;
import global.DispatcherServlet;
import global.Seperator;

@WebServlet("/member.do")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("member 컨트롤러 진입...");
		Seperator.init(request, response);
		MemberService service = MemberServiceImpl.getInstance();
		MemberBean member = new MemberBean();
		switch (Seperator.command.getAction()) {
		case "login":
			member.setId(request.getParameter("id"));
			member.setPw(request.getParameter("pw"));
			String name = service.login(member);
			if (name.equals("fail")) {
				Seperator.command.setPage("login");
				Seperator.command.setView();
			} else {
				Seperator.command.setDirectory(request.getParameter("directory"));
				request.getSession().setAttribute("member", service.findById(member.getId()));
			}
			break;
		case "regist":
			member.setId(request.getParameter("id"));
			member.setPw(request.getParameter("pw"));
			member.setSsn(request.getParameter("ssn"));
			member.setName(request.getParameter("name"));
			member.setRegDate();
			if (service.findById(member.getId()).getId().equals("")) {
				Seperator.command.setPage("regist");
				Seperator.command.setView();
			}else{
				service.regist(member);
			}
			break;
		case "update":
			member.setId(request.getParameter("id"));
			member.setPw(request.getParameter("pw"));
			member.setEmail(request.getParameter("email"));
			service.update(member);
			request.getSession().setAttribute("member", member);
			break;	
		case "delete":break;	
		case "detail":
			break;	
		case "list":break;	 // no
		case "logout":break;	
		case "count":
			request.setAttribute("all", service.count());
			break;	
		case "find_by":break;	// no	
		default:
			break;
		}
		DispatcherServlet.send(request, response, Seperator.command);
	}
}
