
import java.util.ArrayList;

public class DAOAnimal {
	
	public ArrayList<Animal> getLista() {
		return Dados.listaAnimais;
	}
	
	public boolean save(Animal obj) {
		if (obj.getCodigo() == null) {
			Integer codigo = Dados.listaAnimais.size() + 1;
			obj.setCodigo(codigo);
			Dados.listaAnimais.add(obj);
		}
		return true;
	}
	
}
