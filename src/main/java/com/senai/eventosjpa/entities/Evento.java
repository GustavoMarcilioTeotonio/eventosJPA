package com.senai.eventosjpa.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "tb_evento")
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private Date dataInicio;
    private Date dataFim;
    private String local;

    @ManyToOne
    @JoinColumn(name = "organizador_id")
    private Organizador organizador;

    @ManyToMany(mappedBy = "eventos")
    private List<Participante> participantes;

    @OneToMany(mappedBy = "evento")
    private List<Atividade> atividades;

    @OneToMany(mappedBy = "evento")
    private List<Ingresso> ingressos;


}
