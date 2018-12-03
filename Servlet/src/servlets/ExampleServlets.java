package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ExampleServlets")
public class ExampleServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public ExampleServlets() {
        super();

    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
		response.setContentType("text/html");
		PrintWriter output=response.getWriter();
		output.print("<html><title>Welcome</title><body> <h1>Hello World</h1> </body></html>");
	}

	

}
