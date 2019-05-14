package com.grupo.mscn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupo.mscn.model.Conta;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Long>{

}
