package are.edu.unju.fi.tp3.service;
import java.util.List;

import are.edu.unju.fi.tp3.model.Cliente;
public interface IClienteService {
	public void guardarCliente(Cliente unCliente);
	public Cliente crearCliente();
	public List<Cliente> obtenerTodosClientes();
}
