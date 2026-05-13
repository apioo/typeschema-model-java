package org.typeschema.model;

import com.fasterxml.jackson.annotation.*;

@JsonClassDescription("Represents a fixed-structure object (class/record). It supports inheritance and explicit property definitions.")
public class StructDefinitionType extends DefinitionType {
    @JsonPropertyDescription("If true, this struct acts as an abstract template and cannot be instantiated directly.")
    private Boolean base;
    @JsonPropertyDescription("The property name used to distinguish between different implementations of a base struct.")
    private String discriminator;
    @JsonPropertyDescription("Maps discriminator values to their concrete definition names for polymorphic handling.")
    private java.util.Map<String, String> mapping;
    @JsonPropertyDescription("A reference to another struct from which this struct inherits properties.")
    private ReferencePropertyType parent;
    @JsonPropertyDescription("A map of property names to their respective types defining the structure of the object.")
    private java.util.Map<String, PropertyType> properties;
    private String type = "struct";

    @JsonSetter("base")
    public void setBase(Boolean base) {
        this.base = base;
    }

    @JsonGetter("base")
    public Boolean getBase() {
        return this.base;
    }

    @JsonSetter("discriminator")
    public void setDiscriminator(String discriminator) {
        this.discriminator = discriminator;
    }

    @JsonGetter("discriminator")
    public String getDiscriminator() {
        return this.discriminator;
    }

    @JsonSetter("mapping")
    public void setMapping(java.util.Map<String, String> mapping) {
        this.mapping = mapping;
    }

    @JsonGetter("mapping")
    public java.util.Map<String, String> getMapping() {
        return this.mapping;
    }

    @JsonSetter("parent")
    public void setParent(ReferencePropertyType parent) {
        this.parent = parent;
    }

    @JsonGetter("parent")
    public ReferencePropertyType getParent() {
        return this.parent;
    }

    @JsonSetter("properties")
    public void setProperties(java.util.Map<String, PropertyType> properties) {
        this.properties = properties;
    }

    @JsonGetter("properties")
    public java.util.Map<String, PropertyType> getProperties() {
        return this.properties;
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

