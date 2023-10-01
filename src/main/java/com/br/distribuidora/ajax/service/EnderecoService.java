package com.br.distribuidora.ajax.service;

import com.br.distribuidora.ajax.entity.Endereco;
import com.br.distribuidora.ajax.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoService {
    @Autowired
    private EnderecoRepository repository;

    public List<Endereco> listaEnderecoUsuario(Long idUsuario){
        return repository.listaEnderecoUsuario(idUsuario);
    }
    public Endereco create(Endereco endereco) {

        return repository.save(endereco);
    }

    public Endereco update(Endereco endereco) {
        return repository.save(endereco);
    }
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
