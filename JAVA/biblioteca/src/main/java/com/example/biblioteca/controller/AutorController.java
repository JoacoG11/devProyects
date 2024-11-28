package com.example.biblioteca.controller;

import com.example.biblioteca.model.Autor;
import com.example.biblioteca.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/autores")
public class AutorController {

    private final AutorService autorService;

    @Autowired
    public AutorController(AutorService autorService) {
        this.autorService = autorService;
    }

    @GetMapping
    public ResponseEntity<List<Autor>> obtenerTodosLosAutores() {
        List<Autor> autores = autorService.obtenerTodosLosAutores();
        return ResponseEntity.ok(autores);
    }

    @GetMapping("/{nombre}")
    public ResponseEntity<Autor> obtenerAutorPorNombre(@PathVariable String nombre) {
    Optional<Autor> autor = autorService.obtenerAutorPorNombre(nombre);
    return autor.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
}

    @PostMapping
    public ResponseEntity<Autor> crearAutor(@RequestBody Autor autor) {
        Autor nuevoAutor = autorService.guardarAutor(autor);
        return ResponseEntity.ok(nuevoAutor);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarAutor(@PathVariable Long id) {
        autorService.eliminarAutor(id);
        return ResponseEntity.noContent().build();
    }
}
