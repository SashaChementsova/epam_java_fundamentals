package org.tasks.Task1.entity;

import java.util.List;
import java.util.Objects;

public class Person {
    private String email;
    private TypeOfRole role;
    private String password;
    private List<String> messages;
    public Person(){}

    public Person(String email, TypeOfRole role, String password, List<String> messages) {
        this.email = email;
        this.role = role;
        this.password = password;
        this.messages = messages;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(email, person.email) && role == person.role && Objects.equals(password, person.password) && Objects.equals(messages, person.messages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, role, password, messages);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TypeOfRole getRole() {
        return role;
    }

    public void setRole(TypeOfRole role) {
        this.role = role;
    }


    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }

    @Override
    public String toString() {
        return "Person: " +
                "email=" + email + '\'' +
                ", role=" + role +", messages=" + messages;
    }
}


