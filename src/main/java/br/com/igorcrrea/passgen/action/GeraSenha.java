package br.com.igorcrrea.passgen.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.igorcrrea.passgen.model.Gerador;

public class GeraSenha implements Action {

	@Override
	public String run(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		String seed = request.getParameter("seed");
		Integer tamanho = Integer.parseInt(request.getParameter("tamanho"));
		
		String senha = Gerador.gerar(seed, tamanho);
		request.setAttribute("senha", senha);
		request.setAttribute("seed", seed);
		request.setAttribute("tamanho", tamanho);
		
		return "forward:gerador.jsp";
	}
}
