package com.senai.alame.arduino.controllers;

import com.senai.alame.arduino.models.Alarme;
import com.senai.alame.arduino.services.AlarmeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alarme")
@CrossOrigin("*")
public class AlarmeController {

    @Autowired
    private AlarmeService service;

    @PostMapping
    public Alarme criar(@RequestBody Alarme alarme) {
        return service.salvar(alarme);
    }

    @GetMapping
    public List<Alarme> listar() {
        return service.listar();
    }
}