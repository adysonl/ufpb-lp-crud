package imob.acoes;

import org.ayty.webee.Acao;
import org.ayty.webee.Requisicao;
import org.ayty.webee.Resposta;

import imob.Gerente;

public class Editar extends Acao{

	protected void executar(Requisicao req, Resposta resp) {
		String login = req.getParametro("login");
		String nlogin = req.getParametro("nlogin");
		String nnome = req.getParametro("nnome");
		String nsenha = req.getParametro("nsenha");
		Gerente gerente = (Gerente)this.getAplicacao().recuperarObjeto(Gerente.KEY);
		
		gerente.editarUsuario(login, nnome, nlogin, nsenha);
		
		resp.adicionarDado("usuarios", gerente.getListUsuarios());
		resp.abrirPagina("/index.jsp");
		
	}

}
