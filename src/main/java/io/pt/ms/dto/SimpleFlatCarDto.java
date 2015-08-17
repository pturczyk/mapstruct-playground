package io.pt.ms.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class SimpleFlatCarDto {
    private String make;
    private Integer builtYear;
    private List<String> ownerNames;
}
