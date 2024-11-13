package org.example.springCompletionDemo.checkWithExistingRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/person")
public class PersonRestController {

    private final PersonRepository personRepository;

    public PersonRestController(PersonRepository personRepository) {
        this.personRepository = personRepository;

    }

    @GetMapping("/all")
    public List<Person> getAll() {
        return personRepository.findAll();
    }

    @GetMapping("/byNames/{name}+{surname}")
    public List<Person> getByNamesAndSurname(@PathVariable String name, @PathVariable String surname) {
        return personRepository.getByNameAndSurname(name,  surname);
    }

    @GetMapping("/allStudents")
    public List<Person> getAllStudents() {
        return null;
    }

}
