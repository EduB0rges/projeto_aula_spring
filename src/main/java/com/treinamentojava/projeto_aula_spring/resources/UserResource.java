package com.treinamentojava.projeto_aula_spring.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.treinamentojava.projeto_aula_spring.entities.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
    
    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1, "Maria", "maria@gmail.com", "991886767", "123@mudar");
        return ResponseEntity.ok().body(u);
    }
}
