package org.typeschema.model;

import com.fasterxml.jackson.annotation.*;

@JsonClassDescription("A property containing a map of dynamic keys to a consistent value type.")
public class MapPropertyType extends CollectionPropertyType {
    private String type = "map";

    @JsonSetter("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonGetter("type")
    public String getType() {
        return this.type;
    }
}

