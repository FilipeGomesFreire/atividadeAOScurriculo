package com.example.curriculo_api.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import lombok.Data;

@Data
@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String cargo;
    private String empresa;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private String descricao;
    
    // Getters e Setters
}