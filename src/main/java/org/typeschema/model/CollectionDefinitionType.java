package org.typeschema.model;

import com.fasterxml.jackson.annotation.*;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ArrayDefinitionType.class, name = "array"),
    @JsonSubTypes.Type(value = MapDefinitionType.class, name = "map"),
})
@JsonClassDescription("Abstract base for definitions that hold multiple values of a single type, such as arrays or maps.")
public abstract class CollectionDefinitionType extends DefinitionType {
    @JsonPropertyDescription("The type of the elements or values contained within the collection.")
    private PropertyType schema;
    @JsonPropertyDescription("The type of collection (e.g., 'map' or 'array').")
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

