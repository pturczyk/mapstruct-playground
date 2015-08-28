package io.pt.ms.dto;

import java.util.List;

public class SimpleFlatCarDto {
    private String make;
    private Integer builtYear;
    private List<String> ownerNames;

    public SimpleFlatCarDto() {
        // empty
    }

    public SimpleFlatCarDto(String make, Integer builtYear, List<String> ownerNames) {
        this.make = make;
        this.builtYear = builtYear;
        this.ownerNames = ownerNames;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Integer getBuiltYear() {
        return builtYear;
    }

    public void setBuiltYear(Integer builtYear) {
        this.builtYear = builtYear;
    }

    public List<String> getOwnerNames() {
        return ownerNames;
    }

    public void setOwnerNames(List<String> ownerNames) {
        this.ownerNames = ownerNames;
    }
}
