package org.typeschema.model;

import com.fasterxml.jackson.annotation.*;

@JsonClassDescription("A placeholder for a type that will be specified at runtime or through template arguments.")
public class GenericPropertyType extends PropertyType {
    @JsonPropertyDescription("The identifier for the generic (e.g., 'T'). This is matched against template keys in a Reference.")
    private String name;
    private String type = "generic";

    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonGetter("name")
    public String getName() {
        return this.name;
    }

    @JsonSetter("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonGetter("type")
    public String getType() {
        return this.type;
    }
}

