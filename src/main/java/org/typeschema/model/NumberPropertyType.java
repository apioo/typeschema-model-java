package org.typeschema.model;

import com.fasterxml.jackson.annotation.*;

@JsonClassDescription("Represents a floating-point or decimal number.")
public class NumberPropertyType extends ScalarPropertyType {
    private String type = "number";

    @JsonSetter("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonGetter("type")
    public String getType() {
        return this.type;
    }
}

