package org.example.interfeces;

import org.example.Person;

import java.util.List;

public interface IRepository {
    void Add(Person person);
    Person GetById(Person person);
    List<Person> GetAll();
}
