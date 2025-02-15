package com.senai.eventosjpa.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "tb_participante")
public class Participante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;

    @ManyToMany
    @JoinTable(
            name = "evento_participante",
            joinColumns = @JoinColumn(name = "participante_id"),
            inverseJoinColumns = @JoinColumn(name = "evento_id")
    )
    private List<Evento> eventos;

    @OneToMany(mappedBy = "Participante")
    private List<Ingresso> ingressos;


}
