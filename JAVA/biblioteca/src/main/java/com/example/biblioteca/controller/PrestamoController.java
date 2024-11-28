package com.example.biblioteca.controller;

import com.example.biblioteca.model.Prestamo;
import com.example.biblioteca.service.PrestamoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/prestamos")
public class PrestamoController {

    private final PrestamoService prestamoService;

    @Autowired
    public PrestamoController(PrestamoService prestamoService) {
        this.prestamoService = prestamoService;
    }

    @GetMapping
    public ResponseEntity<List<Prestamo>> obtenerTodosLosPrestamos() {
        List<Prestamo> prestamos = prestamoService.obtenerTodosLosPrestamos();
        return ResponseEntity.ok(prestamos);
    }

    @PostMapping
    public ResponseEntity<Prestamo> crearPrestamo(@RequestBody Prestamo prestamo) {
        Prestamo nuevoPrestamo = prestamoService.guardarPrestamo(prestamo);
        return ResponseEntity.ok(nuevoPrestamo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarPrestamo(@PathVariable Long id) {
        prestamoService.eliminarPrestamo(id);
        return ResponseEntity.noContent().build();
    }
}
