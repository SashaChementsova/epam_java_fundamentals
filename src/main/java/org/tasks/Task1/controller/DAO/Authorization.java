package org.tasks.Task1.controller.DAO;

import org.tasks.Task1.entity.People;
import org.tasks.Task1.entity.Person;

import java.util.List;

public interface Authorization {
    Person logIn(People people, String email, String password);
}
