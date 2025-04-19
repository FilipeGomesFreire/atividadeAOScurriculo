package com.example.curriculo_api.controller;

import com.example.curriculo_api.model.Curriculo;
import com.example.curriculo_api.repository.CurriculoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/curriculos")
public class CurriculoController {
    
    @Autowired
    private CurriculoRepository repository;
    
    @GetMapping
    public List<Curriculo> listarTodos() {
        return repository.findAll();
    }
    
    @GetMapping("/{id}")
    public Curriculo buscarPorId(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }
    
    @PostMapping
    public Curriculo adicionar(@RequestBody Curriculo curriculo) {
        return repository.save(curriculo);
    }
    
    @PutMapping("/{id}")
    public Curriculo atualizar(@PathVariable Long id, @RequestBody Curriculo curriculo) {
        curriculo.setId(id);
        return repository.save(curriculo);
    }
    
    @DeleteMapping("/{id}")
    public void remover(@PathVariable Long id) {
        repository.deleteById(id);
    }
}