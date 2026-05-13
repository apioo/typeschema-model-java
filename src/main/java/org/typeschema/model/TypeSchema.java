package org.typeschema.model;

import com.fasterxml.jackson.annotation.*;

@JsonClassDescription("The root object of a TypeSchema document containing imports, definitions, and the entry point.")
public class TypeSchema {
    @JsonPropertyDescription("A dictionary of all types available within this schema document.")
    private java.util.Map<String, DefinitionType> definitions;
    @JsonPropertyDescription("External TypeSchema documents to include, keyed by an alias namespace.")
    private java.util.Map<String, String> _import;
    @JsonPropertyDescription("The main entry-point definition for the schema.")
    private String root;

    @JsonSetter("definitions")
    public void setDefinitions(java.util.Map<String, DefinitionType> definitions) {
        this.definitions = definitions;
    }

    @JsonGetter("definitions")
    public java.util.Map<String, DefinitionType> getDefinitions() {
        return this.definitions;
    }

    @JsonSetter("import")
    public void setImport(java.util.Map<String, String> _import) {
        this._import = _import;
    }

    @JsonGetter("import")
    public java.util.Map<String, String> getImport() {
        return this._import;
    }

    @JsonSetter("root")
    public void setRoot(String root) {
        this.root = root;
    }

    @JsonGetter("root")
    public String getRoot() {
        return this.root;
    }
}

