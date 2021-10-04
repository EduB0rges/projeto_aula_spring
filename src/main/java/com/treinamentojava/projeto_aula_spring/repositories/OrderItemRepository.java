package com.treinamentojava.projeto_aula_spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.treinamentojava.projeto_aula_spring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Integer>{

}
