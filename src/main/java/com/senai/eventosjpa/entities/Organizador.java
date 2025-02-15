package com.senai.eventosjpa.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "tb_organizador")
public class Organizador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;

    @OneToMany(mappedBy = "organizador")
    private List<Evento> eventos;

}
