package com.juan.dev.persistence.mapper;


import com.juan.dev.domain.dto.MovieDto;
import com.juan.dev.domain.dto.UpdateMovieDto;
import com.juan.dev.persistence.entity.MovieEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring", uses = {GenreMapper.class, StateMapper.class})
public interface MovieMapper {

    @Mapping(source = "titulo", target = "title")
    @Mapping(source = "descripcion", target = "description")
    @Mapping(source = "director", target = "director")
    @Mapping(source = "duracion", target = "duration")
    @Mapping(source = "genero", target = "genre" ,qualifiedByName = "stringToGenre")
    @Mapping(source = "calificacion", target = "rating")
    @Mapping(source = "fechaEstreno", target = "releaseDate")
    @Mapping(source = "estado", target = "state", qualifiedByName = "stringToBoolean")
    MovieDto toDto(MovieEntity entity);
    List<MovieDto> toDto(Iterable<MovieEntity> entities);

    @InheritInverseConfiguration
    @Mapping(source = "genre", target = "genero", qualifiedByName = "genreToString")
    @Mapping(source = "state", target = "estado", qualifiedByName = "booleanToString")
    MovieEntity toEntity(MovieDto dto);

    @Mapping(target = "titulo", source = "title")
    @Mapping(target = "descripcion",source = "description")
    @Mapping(target = "director", source = "director")
    @Mapping(target = "fechaEstreno", source = "releaseDate")
    @Mapping(target = "calificacion", source = "rating")
    @Mapping(target = "estado", source = "state", qualifiedByName = "booleanToString")
    void updateEntityFromDto(UpdateMovieDto dto, @MappingTarget MovieEntity entity);
}
