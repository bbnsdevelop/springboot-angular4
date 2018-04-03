package br.com.springbootangular4.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.springbootangular4.rest.request.PessoaRequest;
import br.com.springbootangular4.rest.resouce.PessoaResouce;
import br.com.springbootangular4.rest.response.PessoaResponse;
import br.com.springbootangular4.service.PessoaService;

@RestController
@RequestMapping("/service")
public class PessoaController implements PessoaResouce{
	
	@Autowired
	private PessoaService pessoaService;

	@Override
	public ResponseEntity<PessoaResponse> salvar(@RequestBody PessoaRequest pessoa) {		
		return ResponseEntity.status(HttpStatus.OK).body(pessoaService.salvarPessoa(pessoa));
	}
	@Override
	public ResponseEntity<PessoaResponse> atualizar(@RequestBody PessoaRequest pessoa) {
		return ResponseEntity.status(HttpStatus.OK).body(pessoaService.atualizarPessoa(pessoa));
	}
	@Override
	public ResponseEntity<List<PessoaResponse>> consultar() {
		return ResponseEntity.status(HttpStatus.OK).body(pessoaService.consultarPessoa());
	}
	@Override
	public ResponseEntity<PessoaResponse> buscar(@PathVariable("codigo") Integer codigo) {
		return ResponseEntity.status(HttpStatus.OK).body(pessoaService.buscarPessoa(codigo));
	}
	@Override
	public ResponseEntity<PessoaResponse> excluir(@PathVariable("codigo") Integer codigo) {
		return ResponseEntity.status(HttpStatus.OK).body(pessoaService.excluirPessoa(codigo));
	}
}
