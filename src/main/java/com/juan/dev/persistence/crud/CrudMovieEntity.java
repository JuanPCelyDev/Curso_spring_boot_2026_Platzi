package com.juan.dev.persistence.crud;

import com.juan.dev.persistence.entity.MovieEntity;
import org.springframework.data.repository.CrudRepository;

public interface CrudMovieEntity extends CrudRepository<MovieEntity, Long> {
  MovieEntity findFirstByTitulo(String titulo);
}
