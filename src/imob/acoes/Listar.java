package imob.acoes;

import java.util.LinkedList;

import org.ayty.webee.Acao;
import org.ayty.webee.Requisicao;
import org.ayty.webee.Resposta;

import imob.Gerente;
import imob.Usuario;

public class Listar extends Acao {

	protected void executar(Requisicao req, Resposta resp) {
		Gerente gerente = (Gerente)this.getAplicacao().recuperarObjeto(Gerente.KEY);
		LinkedList<Usuario> usuarios = gerente.getListUsuarios();
		resp.adicionarDado("usuarios", usuarios);
		resp.abrirPagina("/users.jsp");
	}

}
