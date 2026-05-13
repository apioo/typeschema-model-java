package org.typeschema.model;

import com.fasterxml.jackson.annotation.*;

@JsonClassDescription("A reference to a defined type in the global 'definitions' map.")
public class ReferencePropertyType extends PropertyType {
    @JsonPropertyDescription("The name of the definition this property points to.")
    private String target;
    @JsonPropertyDescription("Maps generic names in the target type to concrete definition names.")
    private java.util.Map<String, String> template;
    private String type = "reference";

    @JsonSetter("target")
    public void setTarget(String target) {
        this.target = target;
    }

    @JsonGetter("target")
    public String getTarget() {
        return this.target;
    }

    @JsonSetter("template")
    public void setTemplate(java.util.Map<String, String> template) {
        this.template = template;
    }

    @JsonGetter("template")
    public java.util.Map<String, String> getTemplate() {
        return this.template;
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

