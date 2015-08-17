package io.pt.ms.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class SimpleFlatCarEntity {
    private String make;
    private Integer builtYear;
    private List<String> ownerNames;
}
