package micronaut.example.test;


import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import micronaut.example.test.domain.Person;

import javax.inject.Inject;
import java.util.List;

@Controller("/person")
public class HelloController {

    @Inject
    private PersonRepository personRepository;


    @Get("/list")
    public List<Person> findPersons() {

        return personRepository.findAll();

    }

    @Post(uri = "/save", consumes = MediaType.APPLICATION_JSON)
    public Person savePerson(People people) {

        return personRepository.save(people.getFirstName(), people.getLastName());

    }

}


