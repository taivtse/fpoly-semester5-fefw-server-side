package com.connectnow.converter;

public interface GenericConverter<D, E> {
    D entityToDto(E entity);

    E dtoToEntity(D dto);
}
