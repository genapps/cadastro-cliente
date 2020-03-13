package br.com.xpto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.xpto.models.Fatura;

public interface CadastroFaturaRepository extends JpaRepository<Fatura, Integer>{
	

}
