package org.example;

import org.example.interfeces.IRepository;

import java.util.ArrayList;
import java.util.List;

public class RepositoryA implements IRepository {
    List<Person> personList = new ArrayList<>();

    @Override
    public void Add(Person person) {
        this.personList.add(person);
    }

    @Override
    public Person GetById(Person person) {
        for (Person p : personList) {
            if (p.getId() == person.getId()) {
                return p;
            }
        }
        return null;
    }

    @Override
    public List<Person> GetAll() {
        if(personList.isEmpty()){
            return null;
        }
        return personList;
    }
}
