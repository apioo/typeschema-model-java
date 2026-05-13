package org.typeschema.model;

import com.fasterxml.jackson.annotation.*;

@JsonClassDescription("An object with a dynamic set of keys where every value conforms to the same schema.")
public class MapDefinitionType extends CollectionDefinitionType {
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

