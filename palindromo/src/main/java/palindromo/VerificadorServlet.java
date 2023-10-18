package palindromo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/VerificadorServlet")
public class VerificadorServlet extends HttpServlet {
	 protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {

	        String palavra1 = request.getParameter("palavra1");
	        String palavra2 = request.getParameter("palavra2");

	        Palavra palavraA = new Palavra(palavra1);
	        Palavra palavraB = new Palavra(palavra2);
	        
	        palavraA.verificarPalindromo();
	        palavraB.verificarPalindromo();

	        response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	        out.println("<html>");
	        out.println("<head>");
	        out.println("<title>Resultados</title>");
	        out.println("</head>");
	        out.println("<body>");
	        out.println("<h1>Resultados</h1>");
	        out.println("<p>Palavra 1: " + palavra1 + "</p>");
	        out.println("<p>Palíndromo: " + palavraA.isPalindromo() + "</p>");
	        out.println("<p>Palavra 2: " + palavra2 + "</p>");
	        out.println("<p>Palíndromo: " + palavraB.isPalindromo() + "</p>");
	        out.println("</body>");
	        out.println("</html>");
	    }
}
