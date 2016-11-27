package imob;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Gerente {
	public static final String KEY = "GerenteUsuarios";
	private Map<String, Usuario> usuarios;
	private LinkedList<Usuario> listUsuarios;

	public Gerente() {
		usuarios = new HashMap<String, Usuario>();
		listUsuarios = new LinkedList<Usuario>();
	}

	public void cadastrarUsuario(Usuario usuario) {
		if (usuarios.containsKey(usuario.getLogin())) {
			throw new CadastroUsuarioException("J� existe um usu�rio com login " + usuario.getLogin());
		} else {
			usuarios.put(usuario.getLogin(), usuario);
			listUsuarios.add(usuario);
		}
	}

	public void removerUsuario(String login){
		if (!usuarios.containsKey(login)) {
			throw new CadastroUsuarioException("N�o existe um usu�rio com login " + login);
		} else {
			listUsuarios.remove(usuarios.remove(login));
		}
	}
	public void editarUsuario(String login, String nnome, String nlogin, String nsenha){
		Usuario usuario = usuarios.get(login);
		removerUsuario(login);
		usuario.setNome(nnome);
		usuario.setLogin(nlogin);
		usuario.setSenha(nsenha);
		cadastrarUsuario(usuario);
	}
	public LinkedList<Usuario> getListUsuarios() {
		return this.listUsuarios;
	
		}

	public boolean existeUsuario(String login) {
		return usuarios.containsKey(login);
	}

	public Usuario getUsuario(String login) {
		return usuarios.get(login);
	}
	}

