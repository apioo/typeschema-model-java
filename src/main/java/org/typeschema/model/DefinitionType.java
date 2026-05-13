package org.typeschema.model;

import com.fasterxml.jackson.annotation.*;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ArrayDefinitionType.class, name = "array"),
    @JsonSubTypes.Type(value = MapDefinitionType.class, name = "map"),
    @JsonSubTypes.Type(value = StructDefinitionType.class, name = "struct"),
})
@JsonClassDescription("The base abstract type for all schema definitions. It provides metadata common to all types such as descriptions and deprecation status.")
public abstract class DefinitionType {
    @JsonPropertyDescription("Indicates if this type is legacy and should no longer be used in new implementations.")
    private Boolean deprecated;
    @JsonPropertyDescription("A brief explanation of the purpose and usage of this type.")
    private String description;
    @JsonPropertyDescription("The discriminator value used to identify the specific definition subclass.")
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

    @JsonSetter("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonGetter("type")
    public String getType() {
        return this.type;
    }
}

