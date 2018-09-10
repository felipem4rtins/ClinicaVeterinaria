
import java.util.ArrayList;

public class DAOProprietario {
	
	public ArrayList<Proprietario> getLista() {
		return Dados.listaProprietarios;
	}
	
	public boolean save(Proprietario obj) {
		if (obj.getCodigo() == null) {
			Integer codigo = Dados.listaProprietarios.size() + 1;
			obj.setCodigo(codigo);
			Dados.listaProprietarios.add(obj);
		}
		return true;
	}
	
}
