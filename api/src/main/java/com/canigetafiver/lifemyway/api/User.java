package com.canigetafiver.lifemyway.api;

public class User {
    private String name;
    private String email;

    public User(String name) {
        this.name = name;
        this.email = null;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
