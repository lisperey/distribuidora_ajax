package com.br.distribuidora.ajax.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.Set;


@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Venda implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name="usuario_id")
    private Usuario usuario;

    @OneToMany
    @JoinColumn(name="produto_id")
    private Set<Produto> produto;

    @OneToOne
    @JoinColumn(name="formaPagamento_id")
    private FormaPagamento formaPagamento;

    @OneToOne
    @JoinColumn(name="formaEntrega_id")
    private FormaEntrega formaEntrega;

    private Double valorTotal;




}
