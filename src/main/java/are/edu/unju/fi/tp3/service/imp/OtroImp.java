package are.edu.unju.fi.tp3.service.imp;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import are.edu.unju.fi.tp3.service.IClienteService;
import are.edu.unju.fi.tp3.model.Cliente;
@Service
@Qualifier("otroImp")
public class OtroImp implements IClienteService{

	@Override
	public void guardarCliente(Cliente unCliente) {
		// TODO Auto-generated method stub
		//puedo implementar guardar en una BD y no en un listado
	}

	@Override
	public Cliente crearCliente() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cliente> obtenerTodosClientes() {
		// TODO Auto-generated method stub
		return null;
	}

}
