package com.example.josueexamen.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.josueexamen.database.Usuariojosue;
import com.example.josueexamen.service.Userservicejosue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/a")
public class Usuariocontroller {
@Autowired
    Userservicejosue userservicejosue;
@GetMapping("/usuario")
public List<Usuariojosue> selecionar_todo() {
    return userservicejosue.all();
}
@PostMapping("/usuario")
public String postMethodName(@RequestBody Usuariojosue entity) {
    
    
    return userservicejosue.register(entity);
}
@PutMapping("/usuario")
public String putMethodName( @RequestBody Usuariojosue entity) {
    //TODO: process PUT request
    
    return userservicejosue.borrado_by_name(entity);
}

}
