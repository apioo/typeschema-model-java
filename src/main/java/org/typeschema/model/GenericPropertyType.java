package org.typeschema.model;

import com.fasterxml.jackson.annotation.*;

@JsonClassDescription("Represents a generic placeholder type that is resolved at runtime or via template arguments.")
public class GenericPropertyType extends PropertyType {
    @JsonPropertyDescription("The generic parameter name (e.g., 'T'), which is bound via the template map in a reference.")
    @JsonProperty("name")
    private String name;

    @JsonProperty("type")
    private String type = "generic";


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}

