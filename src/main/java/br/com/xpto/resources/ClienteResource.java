package br.com.xpto.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.xpto.models.Cliente;
import br.com.xpto.service.ClienteService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/cliente") 
@Api(value = "API REST Cliente")
@CrossOrigin(origins = "*")
public class ClienteResource {	
	@Autowired
	ClienteService clienteService;
	
	@GetMapping("/listaclientes")
	@ApiOperation(value = "Retorna uma lista de Clientes")
	public List<Cliente> getClientes(){
		return clienteService.findAll();
	}
}
