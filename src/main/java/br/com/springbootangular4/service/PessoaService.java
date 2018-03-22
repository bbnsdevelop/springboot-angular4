package br.com.springbootangular4.service;

import java.util.List;

import br.com.springbootangular4.rest.response.PessoaResponse;

public interface PessoaService {
	PessoaResponse salvarPessoa(PessoaResponse pessoaResponse);
	PessoaResponse atualizarPessoa(PessoaResponse pessoaResponse);
	List<PessoaResponse> consultarPessoa();
	PessoaResponse buscarPessoa(Integer codigo);
	PessoaResponse excluirPessoa(Integer codigo);
}
