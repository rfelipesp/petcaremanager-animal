package com.petcaremanager.animal.infra.db.entity;

public enum Size {

    MINI("Mini"),
    SMALL("Pequeno"),
    MEDIUM("Médio"),
    BIG("Grande"),
    GIANT("Gigante");

    private final String description;

    Size(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
