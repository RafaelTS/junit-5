package com.rafael.junit_5.service;

import com.rafael.junit_5.model.Person;

public class PersonService implements IPersonService{
    @Override
    public Person createPerson(Person person) {
        return person;
    }
}
