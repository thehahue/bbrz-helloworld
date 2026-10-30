package at.bbrz.helloworld.web;

import at.bbrz.helloworld.entity.Person;
import at.bbrz.helloworld.repo.PersonRepository;
import at.bbrz.helloworld.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping("/person/add")
    public Person addPerson(@RequestParam("fn") String firstName, @RequestParam("ln") String lastName) {
        Person person = new Person();
        person.setFirstName(firstName);
        person.setLastName(lastName);

        person = personService.save(person);

        return person;
    }

    @GetMapping("person/all")
    public List<Person> getAllPersons() {
        return personService.getAllPeople();
    }
}
