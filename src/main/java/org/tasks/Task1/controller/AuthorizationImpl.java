package org.tasks.Task1.controller;

import org.tasks.Task1.controller.DAO.Authorization;
import org.tasks.Task1.entity.People;
import org.tasks.Task1.entity.Person;

import java.util.List;

public class AuthorizationImpl implements Authorization {
    public Person logIn(People people,String email,String password){
        Person p=null;
        List<Person> people1=people.getPeople();
        for (Person person:people1){
            if (password.equals(person.getPassword()) && email.equals(person.getEmail())) {
                p=person;
                break;
            }
        }
        return p;
    }
}
