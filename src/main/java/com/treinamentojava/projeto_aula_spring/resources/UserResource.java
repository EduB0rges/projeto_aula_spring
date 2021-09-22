package com.treinamentojava.projeto_aula_spring.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.treinamentojava.projeto_aula_spring.entities.User;
import com.treinamentojava.projeto_aula_spring.services.UserService;

@RestController
@RequestMapping(value="/users")
public class UserResource {
    
    @Autowired
    private UserService service;
    
    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        //User u = new User(1, "Maria", "maria@gmail.com", "991886767", "123@mudar");
        
        List<User> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
    
    @GetMapping(value= "/{id}")
    public ResponseEntity<User> findById(@PathVariable Integer id){
        User obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
        
    }
}
