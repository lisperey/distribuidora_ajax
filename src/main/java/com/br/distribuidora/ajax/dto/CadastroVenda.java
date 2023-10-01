package com.br.distribuidora.ajax.dto;

import com.br.distribuidora.ajax.entity.Endereco;
import com.br.distribuidora.ajax.entity.FormaEntrega;
import com.br.distribuidora.ajax.entity.Produto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class CadastroVenda {
    private Set<Produto> produtos;
    private Endereco endereco;
    private FormaEntrega formaEntrega;
    private double valorTotal;

}
