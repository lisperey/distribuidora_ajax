package com.br.distribuidora.ajax.dto;

import com.br.distribuidora.ajax.entity.DadosCartoes;
import com.br.distribuidora.ajax.entity.Endereco;

import java.util.List;

public class CadastroUsuario {
    private List<Endereco> enderecos;
    private List<DadosCartoes> dadosCartoes;
    private String nome;
}
