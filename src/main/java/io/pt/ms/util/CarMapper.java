package io.pt.ms.util;

import io.pt.ms.domain.SimpleFlatCarEntity;
import io.pt.ms.dto.NonMatchingFlatCarDto;
import io.pt.ms.dto.SimpleFlatCarDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CarMapper {
    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    SimpleFlatCarDto toSimpleFlatCarDto(SimpleFlatCarEntity car);

    @Mappings({
            @Mapping(source = "make", target = "manufacturer"),
            @Mapping(source = "builtYear", target = "build"),
            @Mapping(target = "valid", constant = "true")
    })
    NonMatchingFlatCarDto toNonMatchingFlatCarDto(SimpleFlatCarEntity car);
}
