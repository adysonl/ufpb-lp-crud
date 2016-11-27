package imob.acoes;

import org.ayty.webee.Acao;
import org.ayty.webee.Requisicao;
import org.ayty.webee.Resposta;

import imob.Gerente;
import imob.Usuario;

public class Login extends Acao {

	protected void executar(Requisicao req, Resposta resp) {
		String login = req.getParametro("login");
		String senha = req.getParametro("senha");

		Gerente gerente = (Gerente)this.getAplicacao().recuperarObjeto(Gerente.KEY);

		if(gerente.existeUsuario(login)){
			Usuario usuario = gerente.getUsuario(login);
			if(senha.equals(usuario.getSenha())){
				resp.adicionarDado("msg", "Logado com sucesso!");
				resp.abrirPagina("/index.jsp");
			}else{
				resp.adicionarDado("msg", "Senha inválida!");
				resp.abrirPagina("/login.jsp");
			}
		}else{
			resp.adicionarDado("msg", "Usuário inexistente!");
			resp.abrirPagina("/login.jsp");
		}

	}

}
