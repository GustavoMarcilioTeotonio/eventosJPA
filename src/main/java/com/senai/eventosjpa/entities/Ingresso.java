package com.senai.eventosjpa.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_ingresso")
public class Ingresso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipo;
    private String preco;

    @ManyToOne
    @JoinColumn(name = "evento_id")
    private Evento evento;

    @ManyToOne
    @JoinColumn(name = "participante_id")
    private Participante participante;


}
