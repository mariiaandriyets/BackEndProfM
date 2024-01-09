package com.proftelran.org.lesson22.example;

public interface Converter<Entity, DTO> {
   DTO toDto(Entity person);
   Entity toObject (DTO personDto);
}
