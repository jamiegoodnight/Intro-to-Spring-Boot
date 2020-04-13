package com.example.demo.model;

import java.util.UUID;

public class Goldfish {

    private final UUID id;
    private final String name;

    public Goldfish(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}