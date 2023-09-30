package com.br.distribuidora.ajax.repository;

import com.br.distribuidora.ajax.entity.DadosCartoes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DadosCartaoRepository extends JpaRepository<DadosCartoes, Long> {

}
