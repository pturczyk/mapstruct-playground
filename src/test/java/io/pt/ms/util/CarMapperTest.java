package io.pt.ms.util;

import io.pt.ms.domain.SimpleFlatCarEntity;
import io.pt.ms.dto.NonMatchingFlatCarDto;
import io.pt.ms.dto.SimpleFlatCarDto;
import org.junit.Test;

import java.util.List;

import static java.util.Collections.singletonList;
import static org.assertj.core.api.Assertions.*;

public class CarMapperTest {

    @Test
    public void testShouldMapSimpleFlatObjects() {
        // given
        String make = "Mercedes";
        Integer year = 2015;
        List<String> owners = singletonList("Ludacris");

        SimpleFlatCarEntity entity = new SimpleFlatCarEntity(make, year, owners);

        // when
        SimpleFlatCarDto carDto = CarMapper.INSTANCE.toSimpleFlatCarDto(entity);

        // then
        assertThat(carDto.getMake()).isEqualTo("Mercedes");
        assertThat(carDto.getBuiltYear()).isEqualTo(2015);
        assertThat(carDto.getOwnerNames()).containsExactly("Ludacris");
    }

    @Test
    public void testShouldMapNonMatchingObjects() {
        String make = "Mercedes";
        Integer year = 2015;
        List<String> owners = singletonList("Ludacris");

        SimpleFlatCarEntity entity = new SimpleFlatCarEntity(make, year, owners);

        // when
        NonMatchingFlatCarDto carDto = CarMapper.INSTANCE.toNonMatchingFlatCarDto(entity);

        // then
        assertThat(carDto.getManufacturer()).isEqualTo("Mercedes");
        assertThat(carDto.getBuild()).isEqualTo(2015);
        assertThat(carDto.isValid()).isTrue();
    }

}