package imob.acoes;

import org.ayty.webee.Acao;
import org.ayty.webee.Requisicao;
import org.ayty.webee.Resposta;

import imob.Gerente;

public class Deletar extends Acao{

	protected void executar(Requisicao req, Resposta resp) {
		String login = req.getParametro("login");
		Gerente gerente = (Gerente)this.getAplicacao().recuperarObjeto(Gerente.KEY);
		gerente.removerUsuario(login);
		
		resp.adicionarDado("usuarios", gerente.getListUsuarios());
		resp.abrirPagina("/index.jsp");
		
	}

}
