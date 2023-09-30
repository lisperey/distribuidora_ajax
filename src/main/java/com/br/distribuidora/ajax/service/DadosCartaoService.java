package com.br.distribuidora.ajax.service;

import com.br.distribuidora.ajax.entity.DadosCartoes;
import com.br.distribuidora.ajax.repository.DadosCartaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DadosCartaoService {
    @Autowired
    private DadosCartaoRepository repository;
    public DadosCartoes create(DadosCartoes dadosCartoes) {

        return repository.save(dadosCartoes);
    }

    public DadosCartoes update(DadosCartoes dadosCartoes) {
        return repository.save(dadosCartoes);
    }
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
