package com.example.entrevueSpringBoot.repositories;

import com.example.entrevueSpringBoot.domain.Film;
import org.springframework.data.repository.CrudRepository;

public interface IFilmRepository<T extends Film> extends CrudRepository<Film, Long> {

    Film getById(Long id);

}
