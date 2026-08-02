package org.typeschema.model;

import com.fasterxml.jackson.annotation.*;

@JsonClassDescription("Represents a key-value map with dynamic key names where all values conform to the same schema.")
public class MapDefinitionType extends CollectionDefinitionType {
    @JsonProperty("type")
    private String type = "map";


    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}

