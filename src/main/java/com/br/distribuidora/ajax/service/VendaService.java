package com.br.distribuidora.ajax.service;

import com.br.distribuidora.ajax.entity.Venda;
import com.br.distribuidora.ajax.repository.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendaService {
    @Autowired
    private VendaRepository repository;

    public List<Venda> listaVendaUsuario(Long idUsuario){
        return repository.listaVendaUsuario(idUsuario);
    }

    public Venda create(Venda venda) {

        return repository.save(venda);
    }

    public Venda update(Venda venda) {
        return repository.save(venda);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }


}
