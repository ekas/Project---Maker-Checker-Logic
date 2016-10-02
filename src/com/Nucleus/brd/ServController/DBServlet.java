package com.Nucleus.brd.ServController;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Nucleus.brd.ServiceLayer.ServiceLayer;

/**
 * Servlet implementation class DBServlet
 */
@WebServlet("/DBServlet")
public class DBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DBServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String operation = null;
		String button = null;
		
		
		operation = request.getParameter("operation");
		button = request.getParameter("btn");
		
		System.out.println("Sessions: "+operation+" , "+button);
		
		HttpSession session = request.getSession(true);
		session.setAttribute("oper",operation);
		
		if(button.equals("maker")){
			if(operation.equals("add")){
				response.sendRedirect("http://localhost:8081/WebApp2CustInventoryBrd/maker/maker_add.html");	
				//getServletContext().getRequestDispatcher("/WEB-INF/maker/maker_add.html").forward(request, response);
			}
			else if(operation.equals("modify")){
				response.sendRedirect("http://localhost:8081/WebApp2CustInventoryBrd/maker/maker_cust_code.html");
				//getServletContext().getRequestDispatcher("/WEB-INF/maker/maker_cust_code.html").forward(request, response);
			}
			else if(operation.equals("view")){
				response.sendRedirect("http://localhost:8081/WebApp2CustInventoryBrd/maker/maker_cust_code.html");
				//getServletContext().getRequestDispatcher("/WEB-INF/maker/maker_cust_code.html").forward(request, response);
			}
			else if(operation.equals("delete")){
				response.sendRedirect("http://localhost:8081/WebApp2CustInventoryBrd/maker/maker_cust_code.html");
				//getServletContext().getRequestDispatcher("/WEB-INF/maker/maker_cust_code.html").forward(request, response);
			}
			else if(operation.equals("searchall")){
				response.sendRedirect("http://localhost:8081/WebApp2CustInventoryBrd/maker/maker_searchall.html");
				//getServletContext().getRequestDispatcher("/WEB-INF/maker/maker_searchall.html").forward(request, response);
			}
			else{
				response.sendRedirect("http://localhost:8081/WebApp2CustInventoryBrd/maker/maker_select.html");
			}
		}
		else if(button.equals("checker")){
			if(operation.equals("viewChecker")){
				
			}
			else if(operation.equals("viewCheckerSpecific")){
				response.sendRedirect("http://localhost:8081/WebApp2CustInventoryBrd/checker/checker_cust_code.html");
			}
			else{
				response.sendRedirect("http://localhost:8081/WebApp2CustInventoryBrd/checker/checker_select.html");
			}
			
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		
		System.out.println(user + " " + pass);
		
		ServiceLayer sl = new ServiceLayer();
		int ret = sl.setVars(user, pass);
		
		
		if(ret == 1){	
			response.sendRedirect("http://localhost:8081/WebApp2CustInventoryBrd/maker/maker_select.html");		
		}
		else if(ret == 2){
			response.sendRedirect("http://localhost:8081/WebApp2CustInventoryBrd/checker/checker_select.html");
		}
		else if(ret == 0){
			response.sendRedirect("http://localhost:8081/WebApp2CustInventoryBrd/index.html");
		}
	}

}
