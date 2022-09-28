package com.igordev.usuariodepartamento.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.igordev.usuariodepartamento.entities.Usuario;
import com.igordev.usuariodepartamento.repositories.UsuarioRepository;

/*Classe responsavel por receber todas as requisicoes e responde-las
 * 
 * Aqui teremos todas as operacoes basicas
 * Pesquisar
 * Salvar
 * Deletar
 * */

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioController {
	
	/*Composicao - chamamos o nosso repository para ter acesso ao banco de dados*/
	@Autowired
	private UsuarioRepository repository;
	
	/*Buscar todos os usuarios e retorna uma lista*/
	@GetMapping
	public List<Usuario> findAll(){
		List<Usuario> result = repository.findAll();
		return result;
	}
	
	/*Buscar apenas um usuario*/
	@GetMapping(value = "/{id}")
	public Usuario findById(@PathVariable Long id){
		Usuario result = repository.findById(id).get();
		return result;
	}
	
	/*Salvar um novo usuario*/
	@PostMapping
	public Usuario insert(@RequestBody Usuario usuario){
		Usuario result = repository.save(usuario);
		return result;
	}

}
