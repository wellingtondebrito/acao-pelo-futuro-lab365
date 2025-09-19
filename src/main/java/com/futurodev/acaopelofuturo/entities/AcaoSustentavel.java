package com.futurodev.acaopelofuturo.entities;

import com.futurodev.acaopelofuturo.enums.TipoAcao;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class AcaoSustentavel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String descricao;

    @Column(nullable = false)
    private String local;

    @Column(nullable = false)
    private LocalDate data;

    @ManyToOne
    @JoinColumn(name = "promotor_id", nullable = false)
    private Promotor promotor;


    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoAcao tipo;

}
