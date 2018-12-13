package com.arpita.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

import com.arpita.ado.IUserDAO;
import com.arpita.ado.InvalidUserException;
import com.arpita.ado.UserDAO;
import com.arpita.util.DAOUtility;

/**
 * Servlet implementation class ValidateServlet
 */
@WebServlet("/ValidateServlet")
public class ValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();

		String user=request.getParameter("user");
		String password=request.getParameter("Password");
		String userType="invalid";
		RequestDispatcher rd1=null;
		try {
		
			userType=getUserType(user,password);


			

			if(userType.equals("Admin")){
				out.print("Hello admin");
				rd1=request.getRequestDispatcher("/AdminServlet"); 
				rd1.forward(request, response);


			}
			else if(userType.equals("user")){
				out.print("<h1>welcome user</h1>");
				rd1=request.getRequestDispatcher("/UserServlet");
				rd1.forward(request, response);

			}
			else
			{

				out.print("Invalid  User");
				//rd1=request.getRequestDispatcher("/InvalidServle");
			}

		}
		catch(InvalidUserException e){
			out.println(e.getMessage());
		}
	}



	public String getUserType(String user, String password) //throws InvalidUserException 
	{
		IUserDAO dao=DAOUtility.getUserDAOVersion2();
		return dao.getuserType(user, password);
	}

}
