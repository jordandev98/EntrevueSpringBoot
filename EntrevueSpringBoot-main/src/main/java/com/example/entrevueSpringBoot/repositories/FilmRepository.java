package com.example.entrevueSpringBoot.repositories;

import com.example.entrevueSpringBoot.domain.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FilmRepository {

    @Autowired
    IFilmRepository<Film> filmRepository;

    public Film saveFilm(Film film) {
        return filmRepository.save(film);
    }


    public Film getById(Long id) {
        return filmRepository.getById(id);
    }


}
