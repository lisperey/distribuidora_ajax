package com.br.distribuidora.ajax.service;

import com.br.distribuidora.ajax.entity.FormaEntrega;
import com.br.distribuidora.ajax.repository.FormaEntregaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormaEntregaService {

    @Autowired
    private FormaEntregaRepository repository;
    public List<FormaEntrega> listaTodos(){
        return repository.findAll();
    }
}
