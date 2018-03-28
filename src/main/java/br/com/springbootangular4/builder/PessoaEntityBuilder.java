package br.com.springbootangular4.builder;

import br.com.springbootangular4.entities.PessoaEntity;

public class PessoaEntityBuilder {
	
	private String  nome; 
	private boolean ativo;
	
	public static PessoaEntityBuilder create(){
		return new PessoaEntityBuilder();
	}
	public PessoaEntityBuilder nome(String nome){
		this.nome = nome;
		return this;
	}
	public PessoaEntityBuilder ativo(Boolean ativo){
		this.ativo = ativo;
		return this;
	}
	public PessoaEntity build(){
		PessoaEntity pessoa = new PessoaEntity();
		pessoa.setNome(nome);
		pessoa.setAtivo(ativo);
		return pessoa;
	}
	
}
