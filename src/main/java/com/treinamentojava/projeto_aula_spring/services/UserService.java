package com.treinamentojava.projeto_aula_spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.treinamentojava.projeto_aula_spring.entities.User;
import com.treinamentojava.projeto_aula_spring.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;
    
    public List<User> findAll(){
        return repository.findAll();
    }
    
    public User findById(Integer id) {
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }
    
    public User insert(User obj) {
        return repository.save(obj);
    }
    
    public void delete(Integer id) {
        repository.deleteById(id);
    }
    
    public User update(Integer id, User obj) {
        User entity = repository.getOne(id);
        updateData(entity, obj);
        return repository.save(entity);
        
    }

    private void updateData(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }
}
