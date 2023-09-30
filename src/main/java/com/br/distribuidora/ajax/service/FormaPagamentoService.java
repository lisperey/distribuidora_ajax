package com.br.distribuidora.ajax.service;

import com.br.distribuidora.ajax.entity.FormaPagamento;
import com.br.distribuidora.ajax.repository.FormaPagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormaPagamentoService {
    @Autowired
    private FormaPagamentoRepository repository;
    public List<FormaPagamento> listaTodos(){
        return repository.findAll();
    }
}
