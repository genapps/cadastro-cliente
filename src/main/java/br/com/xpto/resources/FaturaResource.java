package br.com.xpto.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.xpto.models.Fatura;
import br.com.xpto.service.FaturaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/fatura")
@Api(value = "API REST Fatura")
@CrossOrigin(origins = "*")
public class FaturaResource {	
	@Autowired
	FaturaService faturaService;
	
	@GetMapping("/listafaturas")
	@ApiOperation(value = "Retorna uma lista de Faturas")
	public List<Fatura> getFaturas(){
		return faturaService.findAll();
	}
}
