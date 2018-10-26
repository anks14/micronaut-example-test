package micronaut.example.test;

import io.micronaut.spring.tx.annotation.Transactional;
import micronaut.example.test.domain.Person;

import javax.inject.Singleton;
import javax.persistence.*;
import java.util.List;

@Singleton
public class PersonRepositoryImpl implements PersonRepository {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    @Transactional(readOnly = true)
    public List<Person> findAll() {

        String qlString = " Select p.personId,p.firstName,p.lastName FROM Person as p";
        return entityManager.createQuery(qlString).getResultList();


    }

    @Override
    @Transactional
    public Person save(String firstName, String lastName) {
        Person person = new Person(firstName,lastName);
        entityManager.persist(person);
        return person;
    }
}
