package org.typeschema.model;

import com.fasterxml.jackson.annotation.*;

@JsonClassDescription("Represents a reference to a type defined in the global definitions dictionary.")
public class ReferencePropertyType extends PropertyType {
    @JsonPropertyDescription("The key of the target definition in the definitions map.")
    @JsonProperty("target")
    private String target;

    @JsonPropertyDescription("Binds generic parameter names in the target definition to concrete definition names.")
    @JsonProperty("template")
    private java.util.Map<String, String> template;

    @JsonProperty("type")
    private String type = "reference";


    public void setTarget(String target) {
        this.target = target;
    }

    public String getTarget() {
        return this.target;
    }

    public void setTemplate(java.util.Map<String, String> template) {
        this.template = template;
    }

    public java.util.Map<String, String> getTemplate() {
        return this.template;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}

