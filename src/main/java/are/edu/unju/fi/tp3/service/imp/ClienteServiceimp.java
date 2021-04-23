package are.edu.unju.fi.tp3.service.imp;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import are.edu.unju.fi.tp3.model.Cliente;
import are.edu.unju.fi.tp3.service.IClienteService;
import are.edu.unju.fi.tp3.util.ListadoClientes;
@Service
@Qualifier("unImp")
public class ClienteServiceimp implements IClienteService{
	private List<Cliente> listadoClientes = ListadoClientes.clientes;
	@Autowired
	Cliente unCliente;
	@Override
	public void guardarCliente(Cliente unCliente) {
		LocalDate ultimaCompra=unCliente.getFechaUltimaCompra();
		LocalDate ahora=LocalDate.now();
		Period period=Period.between(ultimaCompra,ahora);
		System.out.println(period);
		
		listadoClientes.add(unCliente);
	}

	@Override
	public Cliente crearCliente() {
		// TODO Auto-generated method stub
		return unCliente;
	}

	@Override
	public List<Cliente> obtenerTodosClientes() {
		// TODO Auto-generated method stub
		return listadoClientes;
	}

}
