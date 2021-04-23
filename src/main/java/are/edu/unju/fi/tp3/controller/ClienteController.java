package are.edu.unju.fi.tp3.controller;

import org.springframework.stereotype.Controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import are.edu.unju.fi.tp3.service.IClienteService;
import are.edu.unju.fi.tp3.model.Cliente;

@Controller
public class ClienteController {
	private static final Log LOGGER = LogFactory.getLog(ClienteController.class);

	@Autowired
	@Qualifier("unImp")
	IClienteService clienteService;

	@GetMapping("/cliente/mostrar")
	public String cargarCliente(Model model) {
		model.addAttribute("unCliente", clienteService.crearCliente());
		model.addAttribute("clientes", clienteService.obtenerTodosClientes());
		return("cliente");
	}

	@PostMapping("/cliente/guardar")
	public String guardarNuevoProducto(@ModelAttribute("unCliente") Cliente nuevoCliente,Model model) {
		LOGGER.info("METHOD: ingresando el metodo Guardar");
		clienteService.guardarCliente(nuevoCliente);		
		LOGGER.info("Tamaño del Listado: "+ clienteService.obtenerTodosClientes().size());
		LOGGER.error("Se pudo guardar el usuario");
		model.addAttribute("n1", "a");
		return "redirect:/cliente/mostrar";
	}
}
