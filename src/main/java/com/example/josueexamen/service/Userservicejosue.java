package com.example.josueexamen.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.josueexamen.database.Usuariojosue;
import com.example.josueexamen.database.UsuariosEspecialesjosue;
import com.example.josueexamen.repository.Usuarioespecialrepositoryjosue;
import com.example.josueexamen.repository.Usuariorepositoryjosue;

import jakarta.transaction.Transactional;

@Service
public class Userservicejosue {
    @Autowired
    Usuariorepositoryjosue usuariorepository;
@Autowired
Usuarioespecialrepositoryjosue usuarioespecialrepositoryjosue;
    public String register(Usuariojosue enti){
         UsuariosEspecialesjosue especial = usuarioespecialrepositoryjosue.findById(enti.getEspecial().getId())
                .orElseThrow(() -> new RuntimeException("Especial not found"));

        // Asignar la instancia obtenida o creada
        enti.setEspecial(especial);

        usuariorepository.save(enti);
        return "creado";
    }

     public List<Usuariojosue> all() {
        // Utiliza Java Streams para convertir Iterable a List
        return StreamSupport.stream(usuariorepository.findAll().spliterator(), false)
                            .collect(Collectors.toList());
    }
    @Transactional
    public String borrado_by_name( Usuariojosue enty){

        usuariorepository.deleteByCorreo(enty.getCorreo());
        return "elimiando";
    }
    
}
