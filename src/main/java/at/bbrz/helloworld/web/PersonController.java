package at.bbrz.helloworld.web;

import at.bbrz.helloworld.entity.Person;
import at.bbrz.helloworld.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PersonController {
    @Autowired
    private PersonService personService;

    @PostMapping("/person/add")
    @ResponseStatus(HttpStatus.CREATED)
    public Person createPerson(@RequestBody Person person) {
        // Neue Personen bekommen ihre ID von der Datenbank.
        person.setId(null);
        return personService.save(person);
    }

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

    @GetMapping("/person/find")
    public Object findPerson(@RequestParam("id") Long id) {
        Person person = personService.findById(id);

        if (person == null) {
            return "Keine Person mit der ID " + id + " gefunden.";
        }

        return person;
    }
}
