package com.seduc2.crudfy.controller;

import com.seduc2.crudfy.entity.Musica;
import com.seduc2.crudfy.service.MusicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping
@RestController
public class ArtistaController {
    @Autowired
    ArtistaController artistaController;

    @GetMapping
    public List<Musica> mostrar() {
        return artistaController.artistaController();
    }

    private List<Musica> artistaController() {

        return List.of();
    }
}
