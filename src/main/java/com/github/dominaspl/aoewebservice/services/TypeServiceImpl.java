package com.github.dominaspl.aoewebservice.services;

import com.github.dominaspl.aoewebservice.converters.TypeConverter;
import com.github.dominaspl.aoewebservice.dtos.TypeDTO;
import com.github.dominaspl.aoewebservice.entities.Type;
import com.github.dominaspl.aoewebservice.repositories.TypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TypeServiceImpl implements TypeService {

    private TypeRepository typeRepository;
    private StatusService statusService;

    public TypeServiceImpl(TypeRepository typeRepository, StatusService statusService) {
        this.typeRepository = typeRepository;
        this.statusService = statusService;
    }

    @Override
    public List<TypeDTO> findAllTypes() {

        List<Type> allTypes = typeRepository.findAllByStatus(statusService.getAllStatuses().get(1));

        if (allTypes == null) {
            throw new IllegalStateException("Types not found!");
        }

        return TypeConverter.convertToTypeDTOList(allTypes);
    }

    @Override
    public TypeDTO findById(Long id) {

        if (id == null) {
            throw new IllegalArgumentException("Id must be given!");
        }

        Optional<Type> optionalType = typeRepository.findByTypeIdAndStatus(id, statusService.getAllStatuses().get(1));
        Type type = optionalType.orElseThrow(() -> new IllegalStateException("Type not found!"));

        return TypeConverter.convertToTypeDTO(type);
    }
}
