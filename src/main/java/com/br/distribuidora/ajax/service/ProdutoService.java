package com.br.distribuidora.ajax.service;

import com.br.distribuidora.ajax.entity.Produto;
import com.br.distribuidora.ajax.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository repository;
    public List<Produto> listaTodos(){
        return repository.findAll();
    }

    public List<Produto> listaProdutoTipo(Long idTipo){
        return repository.listaProdutoTipo(idTipo);
    }
}
