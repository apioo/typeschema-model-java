package org.typeschema.model;

import com.fasterxml.jackson.annotation.*;

@JsonClassDescription("Represents an ordered list of elements where every item conforms to the same schema.")
public class ArrayDefinitionType extends CollectionDefinitionType {
    @JsonProperty("type")
    private String type = "array";


    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}

