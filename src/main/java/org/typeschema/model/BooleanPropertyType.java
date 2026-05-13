package org.typeschema.model;

import com.fasterxml.jackson.annotation.*;

@JsonClassDescription("Represents a true or false value.")
public class BooleanPropertyType extends ScalarPropertyType {
    private String type = "boolean";

    @JsonSetter("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonGetter("type")
    public String getType() {
        return this.type;
    }
}

