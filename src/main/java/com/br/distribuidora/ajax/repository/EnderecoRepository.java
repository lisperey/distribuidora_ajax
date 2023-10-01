package com.br.distribuidora.ajax.repository;

import com.br.distribuidora.ajax.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

    @Query(value = "select " +
            "    * " +
            "    from " +
            "    endereco " +
            "            where " +
            "     endereco.usuario_id = ?1", nativeQuery = true)
    public List<Endereco> listaEnderecoUsuario(Long idUsuario);
}
