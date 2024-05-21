package com.example.josueexamen.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.example.josueexamen.database.UsuariosEspecialesjosue;
import com.example.josueexamen.service.Usuarioespecialserivejosue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class Usuarioespecialcontroller {
    @Autowired
    Usuarioespecialserivejosue usuarioespecialserivejosue;

@PostMapping("/roles")
public String postMethodName(@RequestBody UsuariosEspecialesjosue enty) {
   
    return usuarioespecialserivejosue.creacion(enty);

}




}
