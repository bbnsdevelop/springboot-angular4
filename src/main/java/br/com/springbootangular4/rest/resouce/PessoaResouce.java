package br.com.springbootangular4.rest.resouce;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.springbootangular4.rest.request.PessoaRequest;
import br.com.springbootangular4.rest.response.PessoaResponse;

public interface PessoaResouce {
	@ResponseBody
	@RequestMapping(value="/pessoa", method = RequestMethod.POST) 	
	public ResponseEntity<PessoaResponse> salvar(PessoaRequest pessoa);
	
	@ResponseBody
	@RequestMapping(value="/pessoa", method = RequestMethod.PUT, 
									 consumes=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<PessoaResponse> atualizar(PessoaRequest pessoa);
	
	@ResponseBody
	@RequestMapping(value="/pessoa", method = RequestMethod.GET, 
									 produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<List<PessoaResponse>> consultar();
	
	@ResponseBody
	@RequestMapping(value="/pessoa/{codigo}", method = RequestMethod.GET, 
											  produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<PessoaResponse> buscar(Integer codigo);
	
	@ResponseBody
	@RequestMapping(value="/pessoa/{codigo}", method = RequestMethod.DELETE, 
											  produces=MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<PessoaResponse> excluir(Integer codigo);
}
