package com.br.distribuidora.ajax.dto;

import com.br.distribuidora.ajax.entity.Endereco;
import com.br.distribuidora.ajax.entity.FormaEntrega;
import com.br.distribuidora.ajax.entity.Produto;

import java.util.List;

public class CadastroVenda {
    private List<Produto> produtos;
    private Endereco endereco;
    private FormaEntrega formaEntrega;
    private double valorTotal;

}
