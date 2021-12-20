package com.springboot.cliente;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;


@RestController
@AllArgsConstructor
public class ClienteController {

	@GetMapping()
	public ResponseEntity consultar(String codigo){

		return null;
	}
	
	@Autowired
	ClienteRepository repository;

	@GetMapping("/cliente")
	public List<Cliente> getAllClientes(){

		 return repository.findAll();

	}
	
	@GetMapping("/cliente/{id}")
	public Cliente getClienteByID(@PathVariable Long id) {

		return repository.findById(id).get();
	}
	
	@PostMapping("/cliente")
	public Cliente saveCliente(@RequestBody Cliente cliente) {

		return repository.save(cliente);
	}
	
	@DeleteMapping("/cliente/{id}")
	public void deleteCliente(@PathVariable Long id) {

		repository.deleteById(id);
	}
	
}
