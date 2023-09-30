package com.br.distribuidora.ajax.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.*;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;


@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Produto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Double preco;
    private Integer estoque;
    public enum ProdutoStatus {
        ATIVO,
        CANCELADO
    }
    private ProdutoStatus status;
    private BigInteger lote;
    private Date validadeLote;

}
