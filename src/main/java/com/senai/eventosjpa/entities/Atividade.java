package com.senai.eventosjpa.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "tb_atividade")
public class Atividade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;


    @ManyToOne
    @JoinColumn(name = "Palestrante_id")
    private Palestrante Palestrante;

    @ManyToOne
    @JoinColumn(name = "evento_id")
    private Evento evento;

}
