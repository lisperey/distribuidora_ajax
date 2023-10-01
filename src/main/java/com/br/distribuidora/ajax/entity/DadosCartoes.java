package com.br.distribuidora.ajax.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.Date;


@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class DadosCartoes implements Serializable {
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numeroCartao;
    private Integer cvv;
    private Date vencimento;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public enum TipoCartao{
        DEBITO,
        CREDITO
    }
    private TipoCartao tipo;

    @ManyToOne
    @JoinColumn(name="usuario_id")
    private Usuario usuario;

}
