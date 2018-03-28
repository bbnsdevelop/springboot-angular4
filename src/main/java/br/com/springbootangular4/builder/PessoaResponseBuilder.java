package br.com.springbootangular4.builder;

import br.com.springbootangular4.rest.response.PessoaResponse;

public class PessoaResponseBuilder {
	private int codigo;
	private String nome;
	private Boolean ativo;
	
	public static PessoaResponseBuilder create(){
		return new PessoaResponseBuilder();
	}
	
	public PessoaResponseBuilder codigo(int codigo){
		this.codigo = codigo;
		return this;
	}
	
	public PessoaResponseBuilder nome(String nome){
		this.nome = nome;
		return this;
	}
	
	public PessoaResponseBuilder ativo(Boolean ativo){
		this.ativo = ativo;
		return this;
	}
	public PessoaResponse build(){
		PessoaResponse pessoaResponse = new PessoaResponse();
		pessoaResponse.setAtivo(ativo);
		pessoaResponse.setCodigo(codigo);
		pessoaResponse.setMensagem(nome);
		return pessoaResponse;
	}
	
}
