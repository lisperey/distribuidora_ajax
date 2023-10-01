package com.br.distribuidora.ajax.repository;

import com.br.distribuidora.ajax.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    @Query(value = "select " +
            "    * " +
            "    from " +
            "    usuario " +
            "            where " +
            "    usuario.email = ?1" +
            "AND usuario.senha = ?2", nativeQuery = true)

    public Usuario login(String email, String senha);
}
