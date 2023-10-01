package com.br.distribuidora.ajax.repository;

import com.br.distribuidora.ajax.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    List<Produto> findByNomeContainsIgnoreCase(String nome);

    @Query(value = "select " +
            "    * " +
            "    from " +
            "    produto " +
            "    left join tipo_produto on " +
            "    tipo_produto.id = produto.tipo_produto " +
            "            where " +
            "    produto.tipo_produto = ?1", nativeQuery = true)
    public List<Produto> listaProdutoTipo(Long idTipo);
}
