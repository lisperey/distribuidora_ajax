package com.br.distribuidora.ajax.repository;

import com.br.distribuidora.ajax.entity.FormaEntrega;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormaEntregaRepository extends JpaRepository<FormaEntrega, Long> {
}
