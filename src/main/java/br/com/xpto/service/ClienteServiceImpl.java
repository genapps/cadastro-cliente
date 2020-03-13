package br.com.xpto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.xpto.models.Cliente;
import br.com.xpto.repository.CadastroClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService{ 
	
	@Autowired
	CadastroClienteRepository clienteRepository;
	
	@Override
	public List<Cliente> findAll() {
		return clienteRepository.findAll();
	} 

}
