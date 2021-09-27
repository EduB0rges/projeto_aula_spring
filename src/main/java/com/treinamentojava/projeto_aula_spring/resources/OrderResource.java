package com.treinamentojava.projeto_aula_spring.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.treinamentojava.projeto_aula_spring.entities.Order;
import com.treinamentojava.projeto_aula_spring.services.OrderService;

@RestController
@RequestMapping(value="/orders")
public class OrderResource {
    
    @Autowired
    private OrderService service;
    
    @GetMapping
    public ResponseEntity<List<Order>> findAll(){
        //Order u = new Order(1, "Maria", "maria@gmail.com", "991886767", "123@mudar");
        
        List<Order> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
    
    @GetMapping(value= "/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id){
        Order obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
        
    }
}
