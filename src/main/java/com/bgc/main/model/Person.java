package com.bgc.main.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Person {

    private final UUID id;
    private final String name;
    private final String emailPrimary;

    public Person(@JsonProperty("id") UUID id, @JsonProperty("name") String name, @JsonProperty("emailPrimary") String emailPrimary) {
        this.id = id;
        this.name = name;
        this.emailPrimary = emailPrimary;
    }

    public String getEmailPrimary() {
        return emailPrimary;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
