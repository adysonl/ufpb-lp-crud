package imob;
import org.ayty.webee.Aplicacao;
import org.ayty.webee.ConfigAplicacao;

public class Inicio implements ConfigAplicacao {

	
	public void finalizaAplicacao(Aplicacao app) {
		
	}

	public void iniciaAplicacao(Aplicacao app) {
		Gerente gerente = new Gerente();		
		app.adicionaObjeto(Gerente.KEY, gerente);
	}
}

