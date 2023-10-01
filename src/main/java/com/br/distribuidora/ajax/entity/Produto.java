package com.br.distribuidora.ajax.entity;

import jakarta.persistence.*;
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
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Double preco;
    private Integer estoque;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public enum ProdutoStatus {
        ATIVO,
        CANCELADO
    }
    private ProdutoStatus status;
    private BigInteger lote;
    private Date validadeLote;

    @OneToOne
    @JoinColumn(name="tipo_produto")
    private TipoProduto tipoProduto;

}
