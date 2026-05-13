package org.typeschema.model;

import com.fasterxml.jackson.annotation.*;

@JsonClassDescription("Represents a sequence of characters, optionally following a specific format.")
public class StringPropertyType extends ScalarPropertyType {
    @JsonPropertyDescription("The value to be used if the property is not explicitly provided.")
    private String _default;
    @JsonPropertyDescription("Provides specialized context for the string (e.g., 'date-time').")
    private String format;
    private String type = "string";

    @JsonSetter("default")
    public void setDefault(String _default) {
        this._default = _default;
    }

    @JsonGetter("default")
    public String getDefault() {
        return this._default;
    }

    @JsonSetter("format")
    public void setFormat(String format) {
        this.format = format;
    }

    @JsonGetter("format")
    public String getFormat() {
        return this.format;
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

