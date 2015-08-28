package io.pt.ms.dto;

public class NonMatchingFlatCarDto {
    private String manufacturer;
    private Integer build;
    private boolean valid;

    public NonMatchingFlatCarDto() {
        // empty
    }

    public NonMatchingFlatCarDto(String manufacturer, Integer build) {
        this.manufacturer = manufacturer;
        this.build = build;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Integer getBuild() {
        return build;
    }

    public void setBuild(Integer build) {
        this.build = build;
    }


    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public boolean isValid() {
        return valid;
    }
}
