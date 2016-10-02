package com.Nucleus.brd.ServController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Nucleus.brd.ServiceLayer.CustInfoVars;
import com.Nucleus.brd.ServiceLayer.ServiceLayer;

/**
 * Servlet implementation class formServlet
 */
@WebServlet("/formServlet")
public class formServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public formServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String button = request.getParameter("btn");
		HttpSession session = request.getSession(false);
		
		if(button.equals("maker_modify")){
			String custCode = request.getParameter("custCode");
			String custName = request.getParameter("custName");
			String custAdd1 = request.getParameter("custAdd1");
			String custAdd2 = request.getParameter("custAdd2");
			String custPin = request.getParameter("custPin");
			String custEmail = request.getParameter("custEmail");
			String custContact = request.getParameter("custContact");
			String custPriContact = request.getParameter("custPriContact");
			String recStatus = request.getParameter("recStatus");
			String custAIFlag = request.getParameter("custAIFlag");
			String createBy = request.getParameter("createBy");
			String createDate = request.getParameter("createDate");
			String modBy = request.getParameter("modBy");
			String modDate = request.getParameter("modDate");
			String AuthBy = request.getParameter("AuthBy");
			String AuthDate = request.getParameter("AuthDate");
			
			String recStatusSession = (String)session.getAttribute("recStatus2");
			
			System.out.println("Old Record Status: "+recStatusSession);
			System.out.println("NEW Record Status: "+recStatus);
			
		}
		
				
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(false);
		String operation = (String)session.getAttribute("oper");	
		
		System.out.println(operation + " formservlet get");
		
		ServiceLayer sl = new ServiceLayer();
		CustInfoVars cus;
		String strRet = null;
			
			if(operation.equals("add")){
				
				System.out.println("Into add");
				
				String custCode = request.getParameter("custCode");
				String custName = request.getParameter("custName");
				String custAdd1 = request.getParameter("custAdd1");
				String custAdd2 = request.getParameter("custAdd2");
				String custPin = request.getParameter("custPin");
				String custEmail = request.getParameter("custEmail");
				String custContact = request.getParameter("custContact");
				String custPriContact = request.getParameter("custPriContact");
				String recStatus = request.getParameter("recStatus");
				String custAIFlag = request.getParameter("custAIFlag");
				String createBy = request.getParameter("createBy");
				System.out.println(recStatus);
				System.out.println(custAIFlag);
				
				strRet = sl.setVarsCust(custCode, custName, custAdd1, custAdd2, custPin, 
						custEmail, custContact, custPriContact, recStatus, custAIFlag, createBy);
				System.out.println(strRet);
				
				
				request.setAttribute("ret",strRet);
				getServletContext().getRequestDispatcher("/WEB-INF/maker/display_maker.jsp").forward(request, response);
				
				
			}
			else if(operation.equals("modify")){
				String custCode = request.getParameter("custCode");
				cus = sl.setVarsCust4(custCode);
				
				request.setAttribute("cus", cus);
				
				request.setAttribute("ret","Modify Records");
				request.setAttribute("recStatus1",cus.getRecStatus());
				//response.sendRedirect("http://localhost:8081/WebApp2CustInventoryBrd/maker/maker_modify_view.jsp");	
				getServletContext().getRequestDispatcher("/WEB-INF/maker/maker_modify_view.jsp").forward(request, response);
				
			}
			else if(operation.equals("view")){
				String custCode = request.getParameter("custCode");
				cus = sl.setVarsCust2(custCode);
				
				request.setAttribute("cus", cus);
				
				request.setAttribute("ret","View Particular Record");
				getServletContext().getRequestDispatcher("/WEB-INF/maker/viewdisplay_maker.jsp").forward(request, response);
			}
			else if(operation.equals("delete")){				
				
				String custCode = request.getParameter("custCode");
				
				strRet = sl.setVarsCust(custCode);
				
				request.setAttribute("ret",strRet);
				getServletContext().getRequestDispatcher("/WEB-INF/maker/display_maker.jsp").forward(request, response);
			}
			else if(operation.equals("searchall")){
				System.out.println("Into Search ");					
				List<CustInfoVars> custList = new ArrayList<CustInfoVars>();
				custList = sl.setVarsCust3();
				
				request.setAttribute("cus", custList);
				//System.out.println(custList);
				request.setAttribute("ret","Records list");
				getServletContext().getRequestDispatcher("/WEB-INF/maker/viewdisplay_maker.jsp").forward(request, response);
				
			}		
	}

}
