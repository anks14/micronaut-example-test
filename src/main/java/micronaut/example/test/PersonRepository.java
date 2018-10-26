package micronaut.example.test;


import micronaut.example.test.domain.Person;

import java.util.List;

public interface PersonRepository {

    List<Person> findAll();

    Person save(String firstName,String lastName);
}
