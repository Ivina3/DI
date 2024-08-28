package org.example;

import org.example.interfeces.IService;

public class ServiceA implements IService {
    Person person;

    @Override
    public void create(Person person) {
    this.person=person;
    }

    @Override
    public void read(Person person) {
    this.person.getName();
    this.person.getAge();
    this.person.getId();
    }

    @Override
    public void update(Person person) {
    this.person.setAge(person.getAge());
    this.person.setName(person.getName());
    this.person.setId(person.getId());
    }

    @Override
    public void delete(Person person) {
    this.person=null;
    }
}
