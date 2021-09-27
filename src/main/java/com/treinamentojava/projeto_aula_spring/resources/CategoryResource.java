package com.treinamentojava.projeto_aula_spring.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.treinamentojava.projeto_aula_spring.entities.Category;
import com.treinamentojava.projeto_aula_spring.entities.User;
import com.treinamentojava.projeto_aula_spring.services.CategoryService;

@RestController
@RequestMapping(value="/categories")
public class CategoryResource {
    
    @Autowired
    private CategoryService service;
    
    @GetMapping
    public ResponseEntity<List<Category>> findAll(){
        //User u = new User(1, "Maria", "maria@gmail.com", "991886767", "123@mudar");
        
        List<Category> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
    
    @GetMapping(value= "/{id}")
    public ResponseEntity<Category> findById(@PathVariable Long id){
        Category obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
        
    }
}
