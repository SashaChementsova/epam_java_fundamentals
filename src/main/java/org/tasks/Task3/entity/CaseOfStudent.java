package org.tasks.Task3.entity;

import java.util.Objects;

public class CaseOfStudent {
    private int id;
    private String surname;
    private String name;
    private int group;
    public CaseOfStudent(){}
    public CaseOfStudent(int id, String surname, String name, int group) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Case of student: id=" + id +
                ", surname=" + surname +
                ", name=" + name +
                ", group=" + group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CaseOfStudent aCase = (CaseOfStudent) o;
        return id == aCase.id && group == aCase.group && Objects.equals(surname, aCase.surname) && Objects.equals(name, aCase.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, surname, name, group);
    }
}
