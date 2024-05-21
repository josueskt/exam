package com.example.josueexamen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.josueexamen.database.Usuariojosue;
import com.example.josueexamen.database.UsuariosEspecialesjosue;
import com.example.josueexamen.repository.Usuarioespecialrepositoryjosue;

@Service
public class Usuarioespecialserivejosue {
    @Autowired
    Usuarioespecialrepositoryjosue usuarioespecialrepositoryjosue;

    
    public String creacion(UsuariosEspecialesjosue enty){

 usuarioespecialrepositoryjosue.save(enty);
 return "creado exitosamente";
    }

   
}
