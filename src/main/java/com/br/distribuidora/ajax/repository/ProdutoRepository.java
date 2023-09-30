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
            "    a.* " +
            "    from " +
            "    aluno_online_2023_2.aluno a " +
            "    inner join matricula_aluno ma on " +
            "    ma.id = a.id " +
            "    inner join disciplina d on " +
            "    d.id = ma.disciplina_id " +
            "            where " +
            "    d.id = ?1", nativeQuery = true)
    public List<Produto> listaProdutoTipo(Long idTipo);
}
