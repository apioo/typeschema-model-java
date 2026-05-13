package org.typeschema.model;

import com.fasterxml.jackson.annotation.*;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = BooleanPropertyType.class, name = "boolean"),
    @JsonSubTypes.Type(value = IntegerPropertyType.class, name = "integer"),
    @JsonSubTypes.Type(value = NumberPropertyType.class, name = "number"),
    @JsonSubTypes.Type(value = StringPropertyType.class, name = "string"),
})
@JsonClassDescription("Abstract base for simple value types like strings, numbers, and booleans.")
public abstract class ScalarPropertyType extends PropertyType {
    @JsonPropertyDescription("The specific scalar type name.")
    private String type;

    @JsonSetter("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonGetter("type")
    public String getType() {
        return this.type;
    }
}

