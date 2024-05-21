package com.example.josueexamen.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.josueexamen.database.Usuariojosue;

public interface Usuariorepositoryjosue extends CrudRepository<Usuariojosue,String> {
    
    Usuariojosue findByCorreo(String nombre);
    void deleteByCorreo(String correo);
}
