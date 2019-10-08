package com.github.dominaspl.aoewebservice.converters;

import com.github.dominaspl.aoewebservice.dtos.TypeDTO;
import com.github.dominaspl.aoewebservice.entities.Type;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class TypeConverter {

    public static List<TypeDTO> convertToTypeDTOList(List<Type> types) {

        List<TypeDTO> typeDTOList = new ArrayList<>();

        for (Type type : types) {
            TypeDTO typeDTO = new TypeDTO();
            typeDTO.setTypeId(type.getTypeId());
            typeDTO.setTypeName(type.getTypeName());
            typeDTOList.add(typeDTO);
        }

        return typeDTOList;
    }

    public static List<Type> convertToTypeList(Set<TypeDTO> filteredTypes) {

        List<Type> types = new ArrayList<>();

        for (TypeDTO typeDTO : filteredTypes) {
            Type type = new Type();
            type.setTypeId(typeDTO.getTypeId());
            type.setTypeName(typeDTO.getTypeName());
            types.add(type);
        }

        return types;
    }

    public static TypeDTO convertToTypeDTO(Type type) {

        TypeDTO typeDTO = new TypeDTO();
        typeDTO.setTypeId(type.getTypeId());
        typeDTO.setTypeName(type.getTypeName());
        return typeDTO;
    }
}
