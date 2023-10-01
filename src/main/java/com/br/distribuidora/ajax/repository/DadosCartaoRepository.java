package com.br.distribuidora.ajax.repository;

import com.br.distribuidora.ajax.entity.DadosCartoes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DadosCartaoRepository extends JpaRepository<DadosCartoes, Long> {
    @Query(value = "select " +
            "    * " +
            "    from " +
            "    dados_cartao " +
            "            where " +
            "     dados_cartao.usuario_id = ?1", nativeQuery = true)
    public List<DadosCartoes> listaDadosCartaoUsuario(Long idUsuario);

}
