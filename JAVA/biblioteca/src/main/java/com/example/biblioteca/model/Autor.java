package com.example.biblioteca.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity

public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private  String biografia;
    private String fechaDeNacimiento;

    @OneToMany(mappedBy = "autor")
    private List<Libro> libros;  
}
