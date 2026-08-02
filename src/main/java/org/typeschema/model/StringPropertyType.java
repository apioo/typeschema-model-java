package org.typeschema.model;

import com.fasterxml.jackson.annotation.*;

@JsonClassDescription("Represents a sequence of characters, with optional formatting rules.")
public class StringPropertyType extends ScalarPropertyType {
    @JsonPropertyDescription("The default string value to use if the property is omitted.")
    @JsonProperty("default")
    private String _default;

    @JsonPropertyDescription("Specifies a semantic format or hint for the string value (e.g., 'date-time', 'email', 'uri').")
    @JsonProperty("format")
    private String format;

    @JsonProperty("type")
    private String type = "string";


    public void setDefault(String _default) {
        this._default = _default;
    }

    public String getDefault() {
        return this._default;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getFormat() {
        return this.format;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}

