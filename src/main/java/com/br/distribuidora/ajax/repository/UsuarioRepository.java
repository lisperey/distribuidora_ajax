package com.br.distribuidora.ajax.repository;

import com.br.distribuidora.ajax.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

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

    public Usuario login(String email, String senha);
}
