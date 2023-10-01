package com.br.distribuidora.ajax.repository;

import com.br.distribuidora.ajax.entity.Venda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Long> {
    @Query(value = "select " +
            "    * " +
            "    from " +
            "    venda " +
            "            where " +
            "     venda.usuario_id = ?1", nativeQuery = true)
    public List<Venda> listaVendaUsuario(Long idUsuario);
}
