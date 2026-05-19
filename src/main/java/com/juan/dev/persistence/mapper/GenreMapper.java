package com.juan.dev.persistence.mapper;

import com.juan.dev.domain.Genre;
import org.mapstruct.Named;

public interface GenreMapper {

    @Named("stringToGenre")
    public static Genre stringToGenre(String genero) {
        if (genero == null) return  null;

       return switch (genero.toUpperCase()) {
            case "ACCION" -> Genre.ACTION;
            case "COMEDIA" -> Genre.COMEDY;
            case "DRAMA" -> Genre.DRAMA;
            case "TERROR" -> Genre.HORROR;
            case "CIENCIA FICCION" -> Genre.SCI_FI;
            case "ROMANCE" -> Genre.ROMANCE;
            case "CRIMEN" -> Genre.CRIME;
            case "FANTASIA" -> Genre.FANTASY;
            case "ANIMACION" -> Genre.ANIMATION;
            case "SUSPENSO" -> Genre.THRILLER;
            case "DOCUMENTAL" -> Genre.DOCUMENTARY;
            default -> null; // O puedes lanzar una excepción si el género no es válido
        };
    }

    @Named("genreToString")
    public static String genreToString(Genre genre) {
        if (genre == null) return null;

        return switch (genre) {
            case ACTION -> "ACCION";
            case COMEDY -> "COMEDIA";
            case DRAMA -> "DRAMA";
            case HORROR -> "TERROR";
            case SCI_FI -> "CIENCIA FICCION";
            case ROMANCE -> "ROMANCE";
            case CRIME -> "CRIMEN";
            case FANTASY -> "FANTASIA";
            case ANIMATION -> "ANIMACION";
            case THRILLER -> "SUSPENSO";
            case DOCUMENTARY -> "DOCUMENTAL";
        };
    }
}
