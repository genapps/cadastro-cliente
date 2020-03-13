package br.com.xpto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.xpto.models.Fatura;
import br.com.xpto.repository.CadastroFaturaRepository;

@Service
public class FaturaServiceImpl implements FaturaService{
	
	@Autowired
	CadastroFaturaRepository cadastroFaturaRepository;
	
	@Override
	public List<Fatura> findAll() {
		return cadastroFaturaRepository.findAll();
	} 

}
