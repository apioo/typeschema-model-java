package org.typeschema.model;

import com.fasterxml.jackson.annotation.*;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ArrayDefinitionType.class, name = "array"),
    @JsonSubTypes.Type(value = MapDefinitionType.class, name = "map"),
    @JsonSubTypes.Type(value = StructDefinitionType.class, name = "struct"),
})
@JsonClassDescription("The abstract base type for all schema definitions. It provides common metadata such as descriptions and deprecation status.")
public abstract class DefinitionType {
    @JsonPropertyDescription("Indicates whether this type is deprecated and should not be used in new implementations.")
    @JsonProperty("deprecated")
    private Boolean deprecated;

    @JsonPropertyDescription("A brief explanation of the purpose and usage of this definition.")
    @JsonProperty("description")
    private String description;

    @JsonPropertyDescription("The discriminator value used to identify the specific definition type.")
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

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}

