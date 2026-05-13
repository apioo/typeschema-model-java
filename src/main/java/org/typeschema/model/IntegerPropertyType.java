package org.typeschema.model;

import com.fasterxml.jackson.annotation.*;

@JsonClassDescription("Represents a whole number.")
public class IntegerPropertyType extends ScalarPropertyType {
    private String type = "integer";

    @JsonSetter("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonGetter("type")
    public String getType() {
        return this.type;
    }
}

