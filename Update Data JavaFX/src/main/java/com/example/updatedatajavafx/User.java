package com.example.updatedatajavafx;

import javafx.beans.property.SimpleStringProperty;

public class User {
    private final SimpleStringProperty name;
    private final SimpleStringProperty email;

    public User(String name, String email) {
        this.name = new SimpleStringProperty(name);
        this.email = new SimpleStringProperty(email);
    }

    public String getName() { return name.get(); }
    public void setName(String value) { name.set(value); }

    public String getEmail() { return email.get(); }
    public void setEmail(String value) { email.set(value); }
}
