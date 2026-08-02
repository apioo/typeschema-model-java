package org.typeschema.model;

import com.fasterxml.jackson.annotation.*;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ArrayDefinitionType.class, name = "array"),
    @JsonSubTypes.Type(value = MapDefinitionType.class, name = "map"),
})
@JsonClassDescription("The abstract base type for collection definitions that contain multiple elements of a uniform type.")
public abstract class CollectionDefinitionType extends DefinitionType {
    @JsonPropertyDescription("The schema definition for the elements or values contained in this collection.")
    @JsonProperty("schema")
    private PropertyType schema;

    @JsonPropertyDescription("The collection type identifier (e.g., 'map' or 'array').")
    @JsonProperty("type")
    private String type;


    public void setSchema(PropertyType schema) {
        this.schema = schema;
    }

    public PropertyType getSchema() {
        return this.schema;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}

