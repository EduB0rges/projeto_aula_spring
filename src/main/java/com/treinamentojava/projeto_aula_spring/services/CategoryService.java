package com.treinamentojava.projeto_aula_spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.treinamentojava.projeto_aula_spring.entities.Category;
import com.treinamentojava.projeto_aula_spring.entities.User;
import com.treinamentojava.projeto_aula_spring.repositories.CategoryRepository;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;
    
    public List<Category> findAll(){
        return repository.findAll();
    }
    
    public Category findById(Long id) {
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
