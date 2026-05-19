package com.juan.dev.domain.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;

import java.math.BigDecimal;
import java.time.LocalDate;

public record UpdateMovieDto(

        @NotBlank(message = "El titulo es obligatorio")
        String title,
        @NotBlank(message = "La descripción es obligatoria")
        String description,
        @NotBlank(message = "El director es obligatorio")
        String director,
        @PastOrPresent(message = "La fecha de estreno no puede ser futura")
        LocalDate releaseDate,
        @Min(value = 0, message = "La puntuación no puede ser negativa")
        @Max(value = 10, message = "La puntuación no puede ser mayor a 10")
        Double rating,
        Boolean state) {
}
