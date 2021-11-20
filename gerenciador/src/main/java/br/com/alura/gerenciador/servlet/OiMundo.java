//Essa classe é um servlet
package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/oi")
public class OiMundo extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	//método que atende uma requisição http
	@Override //sobrescrever o método service da classe httpservlet
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		//o out imprime para o fluxo de resposta para o navegador
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("Oi, seu primeiro servlet foi feito");
		out.println("</body>");
		out.println("</html>");
		
		System.out.println("O servlet foi chamado");
		
	}

	
}
