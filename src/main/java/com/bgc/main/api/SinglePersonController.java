package com.bgc.main.api;

import com.bgc.main.model.Person;
import com.bgc.main.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RequestMapping("api/v1/person/{id}")
@RestController
public class SinglePersonController {

    private final PersonService personService;

    @Autowired
    public SinglePersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public Optional<Person> getPersonById(
            @PathVariable("id") UUID id) {
        return personService.getPersonById(id);
    }
}

