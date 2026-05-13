package org.typeschema.model;

import com.fasterxml.jackson.annotation.*;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = AnyPropertyType.class, name = "any"),
    @JsonSubTypes.Type(value = ArrayPropertyType.class, name = "array"),
    @JsonSubTypes.Type(value = BooleanPropertyType.class, name = "boolean"),
    @JsonSubTypes.Type(value = GenericPropertyType.class, name = "generic"),
    @JsonSubTypes.Type(value = IntegerPropertyType.class, name = "integer"),
    @JsonSubTypes.Type(value = MapPropertyType.class, name = "map"),
    @JsonSubTypes.Type(value = NumberPropertyType.class, name = "number"),
    @JsonSubTypes.Type(value = ReferencePropertyType.class, name = "reference"),
    @JsonSubTypes.Type(value = StringPropertyType.class, name = "string"),
})
@JsonClassDescription("The base abstract type for all property definitions within a struct or collection.")
public abstract class PropertyType {
    @JsonPropertyDescription("Flags the property as obsolete.")
    private Boolean deprecated;
    @JsonPropertyDescription("Documentation for the specific property.")
    private String description;
    @JsonPropertyDescription("Indicates whether the value can be null.")
    private Boolean nullable;
    @JsonPropertyDescription("The discriminator value used to identify the specific property subclass.")
    private String type;

    @JsonSetter("deprecated")
    public void setDeprecated(Boolean deprecated) {
        this.deprecated = deprecated;
    }

    @JsonGetter("deprecated")
    public Boolean getDeprecated() {
        return this.deprecated;
    }

    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonGetter("description")
    public String getDescription() {
        return this.description;
    }

    @JsonSetter("nullable")
    public void setNullable(Boolean nullable) {
        this.nullable = nullable;
    }

    @JsonGetter("nullable")
    public Boolean getNullable() {
        return this.nullable;
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

