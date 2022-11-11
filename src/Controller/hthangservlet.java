package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Hangbean;
import bo.Hangbo;

/**
 * Servlet implementation class hthangservlet
 */
@WebServlet("/hthangservlet")
public class hthangservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public hthangservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Tìm kiếm theo key
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		Hangbo hbo = new Hangbo();
		ArrayList<Hangbean> dsHang = hbo.getHang();

		String key = request.getParameter("txttk");
		String giaStr = request.getParameter("txttkgia");
		if (key!=null && key!="") {
			dsHang = hbo.Tim(key);
			request.setAttribute("key", key);
		}
			
		if(giaStr!=null && giaStr!="") {
			int giatk = Integer.parseInt(giaStr);
			dsHang = hbo.TimTheoGia(giatk);
			request.setAttribute("gia", giatk);
		}
		request.setAttribute("dsHang", dsHang);
		RequestDispatcher rd = request.getRequestDispatcher("htHang.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
