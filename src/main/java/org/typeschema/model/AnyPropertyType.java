package org.typeschema.model;

import com.fasterxml.jackson.annotation.*;

@JsonClassDescription("A wildcard property that accepts any valid JSON value (object, array, string, etc.).")
public class AnyPropertyType extends PropertyType {
    private String type = "any";

    @JsonSetter("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonGetter("type")
    public String getType() {
        return this.type;
    }
}

