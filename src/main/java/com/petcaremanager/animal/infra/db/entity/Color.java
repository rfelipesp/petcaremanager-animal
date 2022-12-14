package com.petcaremanager.animal.infra.db.entity;

public enum Color {

    WHITE("Branco"),
    BLACK("Preto"),
    GREY("Cinza"),
    BROWN("Marrom");

    private final String description;

    Color(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
