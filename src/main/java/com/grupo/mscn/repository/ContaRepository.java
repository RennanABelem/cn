package com.grupo.mscn.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupo.mscn.model.Conta;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Long>{

	public Optional<Conta> findByNumeroConta(Long numeroConta);
}
