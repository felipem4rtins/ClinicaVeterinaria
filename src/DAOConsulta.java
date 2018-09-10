
import java.util.ArrayList;

public class DAOConsulta {
	
	public ArrayList<Consulta> getLista() {
		return Dados.listaConsultas;
	}
	
	public boolean save(Consulta obj) {
		if (obj.getCodigo() == null) {
			Integer codigo = Dados.listaConsultas.size() + 1;
			obj.setCodigo(codigo);
			Dados.listaConsultas.add(obj);
		}
		return true;
	}
	
}
