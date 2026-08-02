package org.typeschema.model;

import com.fasterxml.jackson.annotation.*;

@JsonClassDescription("Represents a property containing a key-value map where all values share the same schema.")
public class MapPropertyType extends CollectionPropertyType {
    @JsonProperty("type")
    private String type = "map";


    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}

