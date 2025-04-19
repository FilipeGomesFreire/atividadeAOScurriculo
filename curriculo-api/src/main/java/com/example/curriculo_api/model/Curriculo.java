package com.example.curriculo_api.model;

import jakarta.persistence.*;
import java.util.List;
import lombok.Data;

@Data
@Entity
public class Curriculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nome;
    private String email;
    private String telefone;
    private String endereco;
    private String objetivo;
    
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Experiencia> experiencias;
    
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Formacao> formacoes;
    
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Habilidade> habilidades;
    
    // Getters e Setters não precisa por causa do lombok
}