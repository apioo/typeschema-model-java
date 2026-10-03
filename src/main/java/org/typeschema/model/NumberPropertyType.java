package org.typeschema.model;

import com.fasterxml.jackson.annotation.*;

@JsonClassDescription("Represents a numeric value, including floating-point and decimal numbers.")
public class NumberPropertyType extends ScalarPropertyType {
    @JsonPropertyDescription("The default number value to use if the property is omitted.")
    @JsonProperty("default")
    private Double _default;

    @JsonProperty("type")
    private String type = "number";


    public void setDefault(Double _default) {
        this._default = _default;
    }

    public Double getDefault() {
        return this._default;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}

