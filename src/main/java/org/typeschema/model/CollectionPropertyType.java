package org.typeschema.model;

import com.fasterxml.jackson.annotation.*;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ArrayPropertyType.class, name = "array"),
    @JsonSubTypes.Type(value = MapPropertyType.class, name = "map"),
})
@JsonClassDescription("Abstract base for properties that reference inline maps or arrays.")
public abstract class CollectionPropertyType extends PropertyType {
    @JsonPropertyDescription("The schema definition for the items contained in this property's collection.")
    private PropertyType schema;
    @JsonPropertyDescription("The collection type identifier.")
    private String type;

    @JsonSetter("schema")
    public void setSchema(PropertyType schema) {
        this.schema = schema;
    }

    @JsonGetter("schema")
    public PropertyType getSchema() {
        return this.schema;
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

