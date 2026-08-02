package org.typeschema.model;

import com.fasterxml.jackson.annotation.*;

@JsonClassDescription("The root document object containing namespace imports, type definitions, and the root entry point.")
public class TypeSchema {
    @JsonPropertyDescription("A dictionary mapping definition names to their respective schema definitions.")
    @JsonProperty("definitions")
    private java.util.Map<String, DefinitionType> definitions;

    @JsonPropertyDescription("Maps namespace aliases to external TypeSchema document locations.")
    @JsonProperty("import")
    private java.util.Map<String, String> _import;

    @JsonPropertyDescription("The name of the primary entry-point definition for this schema.")
    @JsonProperty("root")
    private String root;


    public void setDefinitions(java.util.Map<String, DefinitionType> definitions) {
        this.definitions = definitions;
    }

    public java.util.Map<String, DefinitionType> getDefinitions() {
        return this.definitions;
    }

    public void setImport(java.util.Map<String, String> _import) {
        this._import = _import;
    }

    public java.util.Map<String, String> getImport() {
        return this._import;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    public String getRoot() {
        return this.root;
    }
}

