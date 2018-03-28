package br.com.springbootangular4.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.springbootangular4.builder.PessoaEntityBuilder;
import br.com.springbootangular4.builder.PessoaResponseBuilder;
import br.com.springbootangular4.entities.PessoaEntity;
import br.com.springbootangular4.repositories.PessoaRepository;
import br.com.springbootangular4.rest.response.PessoaResponse;
import br.com.springbootangular4.service.PessoaService;

@Service
public class PessoaServiceImpl implements PessoaService{
	
	private PessoaRepository pessoaRepository;
	 
	@Override
	public PessoaResponse salvarPessoa(PessoaResponse pessoaResponse) {
		PessoaEntityBuilder build = PessoaEntityBuilder.create()
			.nome(pessoaResponse.getMensagem())
			.ativo(pessoaResponse.getAtivo());		
		PessoaEntity pessoa = pessoaRepository.save(build.build());
		PessoaResponseBuilder buildResponse = PessoaResponseBuilder.create()
				.ativo(pessoa.isAtivo())
				.codigo(pessoa.getCodigo())
				.nome(pessoa.getNome());
		return buildResponse.build();
	}

	@Override
	public PessoaResponse atualizarPessoa(PessoaResponse pessoaResponse) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PessoaResponse> consultarPessoa() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PessoaResponse buscarPessoa(Integer codigo) {
		PessoaEntity pessoa = pessoaRepository.findById(codigo).get();
		return null;
	}

	@Override
	public PessoaResponse excluirPessoa(Integer codigo) {
		
		PessoaEntity pessoa = pessoaRepository.findById(codigo).get();
		try {
			Integer id = pessoa.getCodigo(); 
			pessoaRepository.delete(pessoa);
 
			return new PessoaResponse(id, "Registro excluido com sucesso!");
 
		}catch(Exception e) {
			return new PessoaResponse(0, e.getMessage());
		}
	}

}
