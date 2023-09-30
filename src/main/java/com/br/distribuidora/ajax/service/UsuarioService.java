package com.br.distribuidora.ajax.service;

import com.br.distribuidora.ajax.entity.Usuario;
import com.br.distribuidora.ajax.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository repository;

    public List<Usuario> listaTodos(){
        return repository.findAll();
    }

    public Usuario login(String email, String senha){
        return repository.login(email, senha);
    }
    public Usuario create(Usuario usuario) {

        return repository.save(usuario);
    }

    public Usuario update(Usuario usuario) {
        return repository.save(usuario);
    }

    public List<Usuario> findAll() {
        return repository.findAll();
    }

    public Optional<Usuario> findById(Long id) {
        return repository.findById(id);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

}
