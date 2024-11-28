package com.example.biblioteca.service;

import com.example.biblioteca.model.Autor;
import com.example.biblioteca.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutorService {
    
    private final AutorRepository autorRepository;

    @Autowired
    public AutorService(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }

    public List<Autor> obtenerTodosLosAutores() {
        return autorRepository.findAll();
    }

    public Optional<Autor> obtenerAutorPorNombre(String nombre) {
        return autorRepository.findByNombre(nombre);
    }

    public Autor guardarAutor(Autor autor) {
        return autorRepository.save(autor);
    }

    public void eliminarAutor(Long id) {
        autorRepository.deleteById(id);
    }
}
