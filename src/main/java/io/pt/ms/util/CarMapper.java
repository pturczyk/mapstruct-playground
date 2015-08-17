package io.pt.ms.util;

import io.pt.ms.domain.SimpleFlatCarEntity;
import io.pt.ms.dto.SimpleFlatCarDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CarMapper {
    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

//    @Mapping(source = "numberOfSeats", target = "seatCount")
    SimpleFlatCarDto toSimpleFlatCarDto(SimpleFlatCarEntity car);
}
