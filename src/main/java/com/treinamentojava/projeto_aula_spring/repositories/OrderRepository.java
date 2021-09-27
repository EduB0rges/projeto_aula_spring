package com.treinamentojava.projeto_aula_spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.treinamentojava.projeto_aula_spring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
