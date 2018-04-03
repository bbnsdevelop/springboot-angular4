package br.com.springbootangular4.service;

import java.util.List;

import br.com.springbootangular4.rest.request.PessoaRequest;
import br.com.springbootangular4.rest.response.PessoaResponse;

public interface PessoaService {
	PessoaResponse salvarPessoa(PessoaRequest pessoaRequest);
	PessoaResponse atualizarPessoa(PessoaRequest pessoaRequest);
	List<PessoaResponse> consultarPessoa();
	PessoaResponse buscarPessoa(Integer codigo);
	PessoaResponse excluirPessoa(Integer codigo);
}
