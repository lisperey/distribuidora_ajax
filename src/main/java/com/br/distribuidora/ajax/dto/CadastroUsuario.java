package com.br.distribuidora.ajax.dto;

import com.br.distribuidora.ajax.entity.DadosCartoes;
import com.br.distribuidora.ajax.entity.Endereco;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class CadastroUsuario {
    private List<Endereco> enderecos;
    private List<DadosCartoes> dadosCartoes;
    private String nome;
}
