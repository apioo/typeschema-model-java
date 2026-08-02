package org.typeschema.model;

import com.fasterxml.jackson.annotation.*;

@JsonClassDescription("Represents a numeric value, including floating-point and decimal numbers.")
public class NumberPropertyType extends ScalarPropertyType {
    @JsonProperty("type")
    private String type = "number";


    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}

