package com.martina.springSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/estudiantes")
public class Controlador {

    private static final List<Estudiante> estudiantes= Arrays.asList(new Estudiante(1L,"Sara")
                                                                    ,new Estudiante(2L,"Pepe")
                                                                    ,new Estudiante(3L,"Hernesto"));

    @GetMapping(path = "{idE}")
    public Estudiante getStudent(@PathVariable("idE") Long id){
        return estudiantes.stream()
                .filter(estudiante -> id.equals(estudiante.getId()))
                .findFirst()
                .orElseThrow(()->new IllegalStateException("El estudiante "+id+" no se ha encontrado"));
    }
}
