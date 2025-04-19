package com.example.curriculo_api.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Habilidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nome;
    private String nivel;
    
    // Getters e Setters
}