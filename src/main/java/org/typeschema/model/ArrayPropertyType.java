package org.typeschema.model;

import com.fasterxml.jackson.annotation.*;

@JsonClassDescription("A property containing a list of items of a consistent type.")
public class ArrayPropertyType extends CollectionPropertyType {
    private String type = "array";

    @JsonSetter("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonGetter("type")
    public String getType() {
        return this.type;
    }
}

