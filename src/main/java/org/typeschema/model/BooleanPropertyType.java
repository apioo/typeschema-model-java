package org.typeschema.model;

import com.fasterxml.jackson.annotation.*;

@JsonClassDescription("Represents a boolean true or false value.")
public class BooleanPropertyType extends ScalarPropertyType {
    @JsonPropertyDescription("The default boolean value to use if the property is omitted.")
    @JsonProperty("default")
    private Boolean _default;

    @JsonProperty("type")
    private String type = "boolean";


    public void setDefault(Boolean _default) {
        this._default = _default;
    }

    public Boolean getDefault() {
        return this._default;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}

