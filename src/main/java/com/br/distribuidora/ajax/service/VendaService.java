package com.br.distribuidora.ajax.service;

import com.br.distribuidora.ajax.dto.CadastroVenda;
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

    public CadastroVenda createVenda(Venda venda){

        Double valotTotal = venda.getProduto().stream().mapToDouble(p -> p.getPreco()).sum();
        venda.setValorTotal(valotTotal);
        Venda venda1 = create(venda);
        CadastroVenda cadastroVenda = new CadastroVenda().builder()
                .formaEntrega(venda1.getFormaEntrega())
                .produtos(venda1.getProduto())
                .formaEntrega(venda1.getFormaEntrega())
                .valorTotal(valotTotal)
                .build();
        return cadastroVenda;
    }

}
