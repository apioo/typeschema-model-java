package org.typeschema.model;

import com.fasterxml.jackson.annotation.*;

@JsonClassDescription("Represents a wildcard property that accepts any valid JSON value (object, array, string, number, boolean, or null).")
public class AnyPropertyType extends PropertyType {
    @JsonProperty("type")
    private String type = "any";


    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}

