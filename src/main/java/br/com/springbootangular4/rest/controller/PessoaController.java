package br.com.springbootangular4.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.springbootangular4.rest.resouce.PessoaResouce;
import br.com.springbootangular4.rest.response.PessoaResponse;
import br.com.springbootangular4.service.PessoaService;

@RestController
@RequestMapping("/service")
public class PessoaController implements PessoaResouce{
	
	@Autowired
	private PessoaService pessoaService;

	@Override
	public PessoaResponse salvar(PessoaResponse pessoa) {
		
		pessoaService.salvarPessoa(pessoa);
		return null;
	}

	@Override
	public PessoaResponse atualizar(PessoaResponse pessoa) {
		pessoaService.atualizarPessoa(pessoa);
		return null;
	}

	@Override
	public List<PessoaResponse> consultar() {
		pessoaService.consultarPessoa();
		return null;
	}

	@Override
	public PessoaResponse buscar(Integer codigo) {
		pessoaService.buscarPessoa(codigo);
		return null;
	}

	@Override
	public PessoaResponse excluir(Integer codigo) {
		pessoaService.excluirPessoa(codigo);
		return null;
	}

}
