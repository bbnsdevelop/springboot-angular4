package br.com.springbootangular4.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.springbootangular4.entities.PessoaEntity;

public interface PessoaRepository extends JpaRepository<PessoaEntity, Integer>{

}
