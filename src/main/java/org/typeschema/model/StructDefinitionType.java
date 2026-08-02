package org.typeschema.model;

import com.fasterxml.jackson.annotation.*;

@JsonClassDescription("Represents an object with a fixed set of properties (such as a class or record). Supports inheritance and explicit property typing.")
public class StructDefinitionType extends DefinitionType {
    @JsonPropertyDescription("When set to true, marks this struct as an abstract base type that cannot be instantiated directly.")
    @JsonProperty("base")
    private Boolean base;

    @JsonPropertyDescription("The property name used to determine the concrete subclass during deserialization.")
    @JsonProperty("discriminator")
    private String discriminator;

    @JsonPropertyDescription("Maps discriminator field values to their corresponding definition names to support polymorphism.")
    @JsonProperty("mapping")
    private java.util.Map<String, String> mapping;

    @JsonPropertyDescription("A reference to another struct definition from which this struct inherits properties.")
    @JsonProperty("parent")
    private ReferencePropertyType parent;

    @JsonPropertyDescription("A map of property names to their respective schema definitions.")
    @JsonProperty("properties")
    private java.util.Map<String, PropertyType> properties;

    @JsonProperty("type")
    private String type = "struct";


    public void setBase(Boolean base) {
        this.base = base;
    }

    public Boolean getBase() {
        return this.base;
    }

    public void setDiscriminator(String discriminator) {
        this.discriminator = discriminator;
    }

    public String getDiscriminator() {
        return this.discriminator;
    }

    public void setMapping(java.util.Map<String, String> mapping) {
        this.mapping = mapping;
    }

    public java.util.Map<String, String> getMapping() {
        return this.mapping;
    }

    public void setParent(ReferencePropertyType parent) {
        this.parent = parent;
    }

    public ReferencePropertyType getParent() {
        return this.parent;
    }

    public void setProperties(java.util.Map<String, PropertyType> properties) {
        this.properties = properties;
    }

    public java.util.Map<String, PropertyType> getProperties() {
        return this.properties;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}

