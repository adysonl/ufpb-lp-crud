package imob.acoes;

import org.ayty.webee.Acao;
import org.ayty.webee.Requisicao;
import org.ayty.webee.Resposta;

import imob.Gerente;
import imob.Usuario;

public class CadastrarUsuario extends Acao{

	protected void executar(Requisicao req, Resposta resp) {
		String nome = req.getParametro("nome");
		String login = req.getParametro("login");
		String senha = req.getParametro("senha");
		Usuario usuario = new Usuario(nome, login, senha);
		Gerente gerente = (Gerente)this.getAplicacao().recuperarObjeto(Gerente.KEY);
		
		gerente.cadastrarUsuario(usuario);
		resp.abrirPagina("/index.jsp");
		
	}

}
