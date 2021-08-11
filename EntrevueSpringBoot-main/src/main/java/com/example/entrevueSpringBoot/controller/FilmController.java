package com.example.entrevueSpringBoot.controller;

import com.example.entrevueSpringBoot.domain.Film;
import com.example.entrevueSpringBoot.repositories.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:8090")
public class FilmController {

    @Autowired
    private FilmRepository filmRepository;


    @PostMapping("/film")
    public ResponseEntity<?> createFilm(@RequestBody Film film) throws URISyntaxException {

        filmRepository.saveFilm(film);

        return new ResponseEntity<>(film, HttpStatus.CREATED);
    }

    @GetMapping("/film/{id}")
    public ResponseEntity<?> getFilm(@PathVariable Long id) {
        Film film = filmRepository.getById(id);
        return new ResponseEntity<>(film, HttpStatus.OK);
    }

}
