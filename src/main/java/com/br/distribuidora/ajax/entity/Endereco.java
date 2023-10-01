package com.br.distribuidora.ajax.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Endereco implements Serializable {

    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String CEP;
    private Integer numero;
    private String cidade;
    private String estado;
    private String complemento;

    @ManyToOne
    @JoinColumn(name="usuario_id")
    private Usuario usuario;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
