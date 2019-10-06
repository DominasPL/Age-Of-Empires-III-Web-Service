package com.github.dominaspl.aoewebservice.converters;

import com.github.dominaspl.aoewebservice.dtos.TypeDTO;
import com.github.dominaspl.aoewebservice.entities.Type;

import java.util.ArrayList;
import java.util.List;

public class TypeConverter {

    public static List<TypeDTO> convertToTypeDTOList(List<Type> types) {

        List<TypeDTO> typeDTOList = new ArrayList<>();

        for (Type type : types) {
            TypeDTO typeDTO = new TypeDTO();
            typeDTO.setTypeName(type.getTypeName());
            typeDTOList.add(typeDTO);
        }

        return typeDTOList;
    }
}
