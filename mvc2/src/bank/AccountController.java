package bank;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AccountController
 */
@WebServlet({"/account/main.do","/account/regist.do","/account/deposit.do","/account/withdraw.do","/account/update.do"
	,"/account/delete.do","/account/list.do","/account/search.do","/account/count.do"})
public class AccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sPath = request.getServletPath();
		System.out.println("리퀘스트가 가져온서블릿경로:"+sPath);
		String[] arr = sPath.split("/");
		String pkg = arr[1];
		String view = arr[2].substring(0, arr[2].indexOf("."));
		RequestDispatcher dis = request.getRequestDispatcher("/WEB-INF/"+pkg+"/"+view+".jsp");
		dis.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
