package com.juan.dev.persistence;

import com.juan.dev.domain.dto.MovieDto;
import com.juan.dev.domain.dto.UpdateMovieDto;
import com.juan.dev.domain.exception.MovieAlreadyExistException;
import com.juan.dev.domain.exception.MovieNotFoundException;
import com.juan.dev.domain.repository.MovieRepository;
import com.juan.dev.persistence.crud.CrudMovieEntity;
import com.juan.dev.persistence.entity.MovieEntity;
import com.juan.dev.persistence.mapper.MovieMapper;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public class MovieEntityRepository implements MovieRepository {
    private final CrudMovieEntity crudMovieEntity;
    private final MovieMapper movieMapper;

    public MovieEntityRepository(CrudMovieEntity crudMovieEntity, MovieMapper movieMapper) {
        this.crudMovieEntity = crudMovieEntity;
        this.movieMapper = movieMapper;
    }

    @Override
    public List<MovieDto> getAll() {
        return this.movieMapper.toDto(crudMovieEntity.findAll());
    }

    @Override
    public MovieDto getById(long id) {
        MovieEntity movieEntity = this.crudMovieEntity.findById(id).orElse(null);
        if (movieEntity == null) {
            throw new MovieNotFoundException(id);
        }
        return movieMapper.toDto(movieEntity);
    }

    @Override
    public MovieDto save(MovieDto movieDto) {
        if(this.crudMovieEntity.findFirstByTitulo(movieDto.title()) != null) {
            throw new MovieAlreadyExistException(movieDto.title());
        }
        MovieEntity movieEntity = this.movieMapper.toEntity(movieDto);
        return this.movieMapper.toDto(this.crudMovieEntity.save(movieEntity));
    }

    @Override
    public MovieDto update(long id, UpdateMovieDto updateMovieDto) {
        MovieEntity  movieEntity = this.crudMovieEntity.findById(id).orElse(null);
       if(movieEntity == null){
           throw new MovieNotFoundException(id);}
        this.movieMapper.updateEntityFromDto(updateMovieDto, movieEntity);
        return  this.movieMapper.toDto(this.crudMovieEntity.save(movieEntity));
    }

    @Override
    public void delete(long id) {
        MovieEntity  movieEntity = this.crudMovieEntity.findById(id).orElse(null);
        if(movieEntity == null){
            throw new MovieNotFoundException(id);
        }
        this.crudMovieEntity.delete(movieEntity);
    }


}
