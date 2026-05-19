package com.juan.dev.web.controller;


import com.juan.dev.domain.dto.MovieDto;
import com.juan.dev.domain.dto.SuggestRequestDto;
import com.juan.dev.domain.dto.UpdateMovieDto;
import com.juan.dev.domain.service.MovieService;
import com.juan.dev.domain.service.PlataformaPelisAiService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
@Tag(name = "Movies", description = "Operations about movies of plataforma Pelis")
public class MovieController {

    private final MovieService movieService;
    private final PlataformaPelisAiService aiService;
    public MovieController(MovieService movieService, PlataformaPelisAiService aiService) {
        this.movieService = movieService;
        this.aiService = aiService;
    }

    @GetMapping
    public ResponseEntity< List<MovieDto>> getAll() {

        List<MovieDto> movieDtoList = movieService.getAll();
        if (movieDtoList.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(movieDtoList);
    }

    @GetMapping("/{id}")
    @Operation(
            summary = "Get a movie by its id",
            description = "Returns a single movie based on the provided id",
            responses ={
                    @ApiResponse(responseCode = "200", description = "Movie found and returned successfully"),
                    @ApiResponse(responseCode = "404", description = "Movie not found with the provided id", content = @Content)
            }
    )

    public ResponseEntity<MovieDto> getById(@Parameter(description = "ID of the movie to retrieve", example = "9") @PathVariable long id) {
        MovieDto movieDto = movieService.getById(id);
        if (movieDto == null) {return ResponseEntity.notFound().build();}
        return  ResponseEntity.ok(movieDto);
    }

    @PostMapping("/suggest")
    public ResponseEntity<String> generateMoviesSuggestion(@RequestBody SuggestRequestDto suggestRequestDto) {
      return ResponseEntity.ok(aiService.generateMoviesSuggestion(suggestRequestDto.userPreferences()));
    }

    @PostMapping
    public ResponseEntity<MovieDto> add(@RequestBody MovieDto movieDto) {
      return  ResponseEntity.status(HttpStatus.CREATED).body(movieService.add(movieDto));
    }

    @PutMapping({"/{id}"})
    public ResponseEntity<MovieDto>  update(@PathVariable Long id,@RequestBody @Valid UpdateMovieDto updateMovieDto) {
        return ResponseEntity.ok(movieService.update(id, updateMovieDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        movieService.delete(id);
        return ResponseEntity.ok().build();
    }

}
