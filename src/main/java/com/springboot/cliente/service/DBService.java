package com.springboot.cliente.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.cliente.repositories.ClienteRepository;
import com.springboot.cliente.repositories.InformaçõesRepository;

@Service
public class DBService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private InformaçõesRepository informaçõesRepository;
	
	
	public void instanciaBaseDeDados() {
		
	}
}
