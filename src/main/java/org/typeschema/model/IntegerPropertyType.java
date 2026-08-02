package org.typeschema.model;

import com.fasterxml.jackson.annotation.*;

@JsonClassDescription("Represents a whole number without fractional components.")
public class IntegerPropertyType extends ScalarPropertyType {
    @JsonProperty("type")
    private String type = "integer";


    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}

