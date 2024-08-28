package org.example.interfeces;

import org.example.Person;

public interface IService {
    void create(Person person);
    void read(Person person);
    void update(Person person);
    void delete(Person person);
}
