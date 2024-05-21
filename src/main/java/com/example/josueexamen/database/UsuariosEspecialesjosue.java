package com.example.josueexamen.database;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;



@Entity
@Data
@Table(name = "usuariosEspeciales")
public class UsuariosEspecialesjosue {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    @Column(name = "rol")
    private String rol;
    @Column(name = "activo")
    private boolean activo ;
    
     @OneToMany(mappedBy = "especial")
    private List<Usuariojosue> usuarios;


    


    



    
}
