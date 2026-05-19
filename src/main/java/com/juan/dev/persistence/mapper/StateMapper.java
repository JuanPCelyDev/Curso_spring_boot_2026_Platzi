package com.juan.dev.persistence.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface StateMapper {


    @Named("stringToBoolean")
    default boolean stringToBoolean(String estado) {
        return "A".equalsIgnoreCase(estado);
    }

    @Named("booleanToString")
    default String booleanToString(boolean estado) {
        return estado ? "A" : "I";}
}
