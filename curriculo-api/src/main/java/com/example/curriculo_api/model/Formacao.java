package com.example.curriculo_api.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import lombok.Data;

@Data
@Entity
public class Formacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String instituicao;
    private String curso;
    private String nivel;
    private LocalDate dataConclusao;
    
    // Getters e Setters
}