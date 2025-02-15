package com.senai.eventosjpa.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "tb_palestrante")
public class Palestrante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String bio;

    @OneToMany(mappedBy = "Palestrante")
    private List<Atividade> atividades;

}
