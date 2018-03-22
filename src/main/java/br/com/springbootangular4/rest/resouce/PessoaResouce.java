package br.com.springbootangular4.rest.resouce;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.springbootangular4.rest.response.PessoaResponse;

public interface PessoaResouce {
	
	@RequestMapping(value="/pessoa", method = RequestMethod.POST, 	
									 consumes=MediaType.APPLICATION_JSON_UTF8_VALUE,
									 produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody PessoaResponse salvar(@RequestBody PessoaResponse pessoa);
	
	@RequestMapping(value="/pessoa", method = RequestMethod.PUT, 
									 consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody PessoaResponse atualizar(@RequestBody PessoaResponse pessoa);
	
	@RequestMapping(value="/pessoa", method = RequestMethod.GET, 
									 produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody List<PessoaResponse> consultar();
	
	@RequestMapping(value="/pessoa/{codigo}", method = RequestMethod.GET, 
											  produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody PessoaResponse buscar(@PathVariable("codigo") Integer codigo);
	
	@RequestMapping(value="/pessoa/{codigo}", method = RequestMethod.DELETE, 
											  produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody PessoaResponse excluir(@PathVariable("codigo") Integer codigo);
}
