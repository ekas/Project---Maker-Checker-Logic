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
		String userSession2 = (String)session.getAttribute("userSession");		
		
		System.out.println(button + " formservlet get");
		
		ServiceLayer sl = new ServiceLayer();
		CustInfoVars cus;
		String strRet = null;
		
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
			String authBy = request.getParameter("authBy");
			String authDate = request.getParameter("authDate");
			
			String recStatusSession = (String)session.getAttribute("recStatus2");
			
			System.out.println("Old Record Status: "+recStatusSession);
			System.out.println("NEW Record Status: "+recStatus);
			
			if(recStatusSession.equals("N") && recStatus.equals("M")){
				//still stays New N and Modifies in temporary table 
			}
			else if(recStatusSession.equals("N") && recStatus.equals("D")){
				//hard delete from temporary
			}
			else if(recStatusSession.equals("M") && recStatus.equals("M")){
				//still stays Modify M and Modifies in temporary table 
			}
			else if(recStatusSession.equals("M") && recStatus.equals("D")){
				//hard delete from temporary, stays in permanent 
			}
			else if(recStatusSession.equals("NR") && recStatus.equals("M")){
				//change to Modify M and Modifies in temporary table 
			}
			else if(recStatusSession.equals("NR") && recStatus.equals("D")){
				//hard delete from temporary 
			}
			else if(recStatusSession.equals("MR") && recStatus.equals("M")){
				//change to Modify M and Modifies in temporary table 
			}
			else if(recStatusSession.equals("MR") && recStatus.equals("D")){
				//hard delete from temporary, stays in permanent 
			}
		}
		else if(button.equals("Authorize")){
			
			
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
			String authBy = userSession2;
			
			System.out.println("Authorize: "+custCode + " "+ recStatus +" " +custAIFlag);
			
			System.out.println(userSession2);
			if(recStatus.equals("N")){
				//send data to permanent table with recStatus A and hard delete from temporary
				strRet = sl.setVarsCustCheckerA(custCode, custName, custAdd1, custAdd2, custPin, 
						custEmail, custContact, custPriContact, recStatus, custAIFlag, createBy,createDate,modBy,modDate,authBy);
			}
			else if(recStatus.equals("D")){
				// hard delete from permanent and temporary
			}
			else if(recStatus.equals("M")){
				//update data to permanent table with recStatus A and hard delete from temporary
			}
			
		}
		else if(button.equals("Reject")){
			String custCode = request.getParameter("custCode");
			String recStatus = request.getParameter("recStatus");
			String custAIFlag = request.getParameter("custAIFlag");
			
			System.out.println("Reject: "+custCode + " "+ recStatus +" " +custAIFlag);
			
			if(recStatus.equals("N")){
				//update the temporary record with recStatus with NR 
			}
			else if(recStatus.equals("M")){
				//update the temporary record with recStatus with MR 
			}
			else if(recStatus.equals("D")){
				//update the temporary record with recStatus with DR 
			}
		}
		else if(button.equals("Back")){
			response.sendRedirect("http://localhost:8081/WebApp2CustInventoryBrd/checker/checker_select.html");
		}
		else{
			response.sendRedirect("http://localhost:8081/WebApp2CustInventoryBrd/index.html");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(false);
		String operation = (String)session.getAttribute("oper");	
		
		System.out.println(operation + " formservlet post");
		
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
			else if(operation.equals("modify_master")){
				String custCode = request.getParameter("custCode");
				//look in permanent data and do changes
				//cus = sl.setVarsCust4(custCode);
				
				//request.setAttribute("cus", cus);
				
				//request.setAttribute("ret","Modify Records");
				//request.setAttribute("recStatus1",cus.getRecStatus());
				//response.sendRedirect("http://localhost:8081/WebApp2CustInventoryBrd/maker/maker_modify_view.jsp");	
				//getServletContext().getRequestDispatcher("/WEB-INF/maker/maker_modify_view.jsp").forward(request, response);
				
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
			else if(operation.equals("viewCheckerSpecific")){
				String custCode = request.getParameter("custCode");
				cus = sl.setVarsCust2(custCode);
				
				request.setAttribute("cus", cus);
				System.out.println(custCode);
				System.out.println(cus.getRecStatus());
				request.setAttribute("ret","View Particular Record to be Authorized");
				getServletContext().getRequestDispatcher("/WEB-INF/checker/viewdisplay_checker.jsp").forward(request, response);
			}
			else if(operation.equals("viewChecker")){				
				response.sendRedirect("http://localhost:8081/WebApp2CustInventoryBrd/checker/checker_select.html");
			}
	}

}
