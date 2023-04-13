package org.tasks.Task1.entity;

import java.util.ArrayList;
import java.util.List;

public class People {
    List<Person> people;
    {
        people=new ArrayList<>();
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }
}
