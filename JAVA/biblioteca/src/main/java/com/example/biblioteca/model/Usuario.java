package com.example.biblioteca.model;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

     private String nombre;
     private String correo;

     @Enumerated(EnumType.STRING)
     private Rol rol;

     public enum Rol {
        ADMINISTRADOR,
        LECTOR
     }
}
