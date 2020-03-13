package br.com.xpto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.xpto.models.Cliente;

public interface CadastroClienteRepository extends JpaRepository<Cliente, Integer>{ 
	

}
