package org.tasks.Task1.controller.DAO;

import org.tasks.Task1.entity.Person;

import java.util.List;

public interface PersonDAO {
    void addNewPerson(Person person);
    void sendEmail(String mess);
    void readFileWithPeople();
    void recordFileWithPeople();
    void deletePerson(Person person);


}
