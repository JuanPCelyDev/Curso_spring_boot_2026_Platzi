package com.juan.dev.domain.dto;

import com.juan.dev.domain.Genre;

import java.time.LocalDate;

public record MovieDto(
        Long id,
        String title,
        String description,
        String director,
        Integer duration,
        Genre genre,
        LocalDate releaseDate,
        Double rating,
        Boolean state) {
}
