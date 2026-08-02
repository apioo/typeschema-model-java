package org.typeschema.model;

import com.fasterxml.jackson.annotation.*;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ArrayPropertyType.class, name = "array"),
    @JsonSubTypes.Type(value = MapPropertyType.class, name = "map"),
})
@JsonClassDescription("The abstract base type for properties that define inline collections (maps or arrays).")
public abstract class CollectionPropertyType extends PropertyType {
    @JsonPropertyDescription("The schema definition for the items contained within this collection property.")
    @JsonProperty("schema")
    private PropertyType schema;

    @JsonPropertyDescription("The collection type identifier.")
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

