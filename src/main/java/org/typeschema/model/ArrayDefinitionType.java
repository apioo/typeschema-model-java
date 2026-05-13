package org.typeschema.model;

import com.fasterxml.jackson.annotation.*;

@JsonClassDescription("An ordered list of values where every item conforms to the same schema.")
public class ArrayDefinitionType extends CollectionDefinitionType {
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

