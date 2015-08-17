package io.pt.ms.util;

import io.pt.ms.domain.SimpleFlatCarEntity;
import io.pt.ms.dto.SimpleFlatCarDto;
import org.junit.Test;

import java.util.List;

import static java.util.Collections.singletonList;
import static org.assertj.core.api.Assertions.*;

public class CarMapperTest {

    @Test
    public void testShouldMapSimpleFlatEntities() {
        // given
        String make = "Mercedes";
        Integer year = 2015;
        List<String> owners = singletonList("Ludacris");

        SimpleFlatCarEntity entity = new SimpleFlatCarEntity(make, year, owners);

        // when
        SimpleFlatCarDto carDto = CarMapper.INSTANCE.toSimpleFlatCarDto(entity);

        // then
        assertThat(carDto.getMake()).isEqualTo(make);
        assertThat(carDto.getBuiltYear()).isEqualTo(year);
//        assertThat(carDto.getOwnerNames()).containsExactly(owners);
    }

}