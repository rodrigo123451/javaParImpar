package ParServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ParService.ParService;

/**
 * Servlet implementation class ParServlet
 */
@WebServlet("/ParServlet")
public class ParServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Integer n1=Integer.parseInt(request.getParameter("Numero 1"));
		String resultado=" ";
		ParService service=new ParService();
		if (ParService.EsPar(n1)) {
            resultado=("Sí es par");
        } else {
            resultado=("No es par");
        }
		//reporte
				response.setContentType("text/hyml;charset=UTF-8");
				PrintWriter out=response.getWriter();
				out.println("<!DOCTYPE html>");
				out.println("<html>");
				out.println("<head>");
				out.println("<title>SI ES PAR </title>");
				out.println("</head>");
				out.println("<body>");
				out.println("<h1>CSI ES PAR</h1>");
				out.println("<p>numero 1:"+n1+"</p>");
				
				out.println("<p>resultado:"+resultado+"</p>");
				out.println("<p><a href='index.html'>nueva operacion</a></p>");
				out.println("</body>");
				out.println("</html>");
				out.flush();
	}

}
