package com.springboot.cliente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.cliente.domain.Informações;

@Repository
public interface InformaçõesRepository extends JpaRepository<Informações, Long> {
	

}
