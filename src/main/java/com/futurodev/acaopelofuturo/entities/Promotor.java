package com.futurodev.acaopelofuturo.entities;

import com.futurodev.acaopelofuturo.enums.TipoPromotor;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Promotor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    private String telefone;

    private String email;

    private TipoPromotor tipo;
    @OneToMany(mappedBy = "promotor", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<AcaoSustentavel> acaoSustentavel = new ArrayList<>();
}
