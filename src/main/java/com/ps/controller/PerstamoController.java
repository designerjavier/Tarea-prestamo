package com.ps.controller;

import com.ps.model.Prestamo;

import com.ps.service.imp.PrestamoService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Tabla-Prestamo")

public class PerstamoController {

    private final PrestamoService prestamoService;
    PerstamoController(PrestamoService prestamoService) {
        this.prestamoService =prestamoService;
    }
    @PostMapping
    public ResponseEntity<List<Prestamo>>savePrestamo(@RequestBody Prestamo prestamo){
        return ResponseEntity.ok(prestamoService.getPrestamo());
            }
    @PutMapping
    public ResponseEntity<List<Prestamo>>updatePrestamo(@RequestBody Prestamo prestamo){
        return ResponseEntity.ok(prestamoService.getPrestamo());
    }
    @DeleteMapping
    public ResponseEntity<List<Prestamo>>deletePrestamo(@PathVariable Long id){
        return ResponseEntity.ok(prestamoService.getPrestamo());
    }

}
