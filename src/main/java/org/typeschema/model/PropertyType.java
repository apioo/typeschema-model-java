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
@JsonClassDescription("The abstract base type for all property definitions within a struct or collection.")
public abstract class PropertyType {
    @JsonPropertyDescription("Indicates whether this property is deprecated and should no longer be used.")
    @JsonProperty("deprecated")
    private Boolean deprecated;

    @JsonPropertyDescription("Documentation explaining the purpose and usage of this property.")
    @JsonProperty("description")
    private String description;

    @JsonPropertyDescription("Indicates whether this property accepts a null value.")
    @JsonProperty("nullable")
    private Boolean nullable;

    @JsonPropertyDescription("The discriminator value used to identify the specific property type.")
    @JsonProperty("type")
    private String type;


    public void setDeprecated(Boolean deprecated) {
        this.deprecated = deprecated;
    }

    public Boolean getDeprecated() {
        return this.deprecated;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public void setNullable(Boolean nullable) {
        this.nullable = nullable;
    }

    public Boolean getNullable() {
        return this.nullable;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}

