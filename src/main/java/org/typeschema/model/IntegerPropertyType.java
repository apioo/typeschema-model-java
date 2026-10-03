package org.typeschema.model;

import com.fasterxml.jackson.annotation.*;

@JsonClassDescription("Represents a whole number without fractional components.")
public class IntegerPropertyType extends ScalarPropertyType {
    @JsonPropertyDescription("The default integer value to use if the property is omitted.")
    @JsonProperty("default")
    private Integer _default;

    @JsonProperty("type")
    private String type = "integer";


    public void setDefault(Integer _default) {
        this._default = _default;
    }

    public Integer getDefault() {
        return this._default;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}

