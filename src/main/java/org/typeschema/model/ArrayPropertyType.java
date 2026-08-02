package org.typeschema.model;

import com.fasterxml.jackson.annotation.*;

@JsonClassDescription("Represents a property containing a list of items that share the same schema.")
public class ArrayPropertyType extends CollectionPropertyType {
    @JsonProperty("type")
    private String type = "array";


    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}

