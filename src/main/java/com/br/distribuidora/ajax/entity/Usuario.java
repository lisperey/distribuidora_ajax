package com.br.distribuidora.ajax.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String CPF;

    private Date data_nascimento;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public enum AlunoStatus {
        ATIVO,
        CANCELADO
    }
    private AlunoStatus status;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Endereco> enderecos;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<DadosCartoes> dadosCartoes;
}
