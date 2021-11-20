package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovaEmpresaServlet
 */
@WebServlet("/novaEmpresa")//link para url
public class NovaEmpresaServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	//protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//doPost: só dá suporte ao método post (usar em logins seria interessante)
	//doGet: só dá suporte ao método get
	//service: dá suporte aos dois métodos (get e post)
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// TODO Auto-generated method stub
		String nomeDaEmpresa = request.getParameter("nome");
		String cnpjDaEmpresa = request.getParameter("cnpj");
		
		//escreve a mensagem na tela do navegador
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h2>Empresa: " + nomeDaEmpresa + " CNPJ: "+ cnpjDaEmpresa + " cadastrada com sucesso</h2>");
		out.println("</body>");
		out.println("</html>");
		
		
	}

}
