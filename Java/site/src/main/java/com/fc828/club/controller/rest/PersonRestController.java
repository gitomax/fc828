package com.fc828.club.controller.rest;

import com.fc828.club.model.PersonDTO;
import com.fc828.club.model.PlayerDTO;
import com.fc828.club.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
@RequestMapping("/api/v1")
public class PersonRestController {

    private final PersonService personService;

    public PersonRestController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/person")
    public PersonDTO getPerson(){
        log.debug("Get person");

        PersonDTO personDTO = buildPerson();
        personDTO.setShowOnCalendar(true);
        personDTO.setCreatedOn("DD-MM-YYYY");

        return personDTO;
    }
    @PostMapping("/person")
    public PersonDTO updatePerson(){
        log.debug("POST person");

        PlayerDTO personDTO = buildPlayer();
        personDTO.setDateOfBirth("1988-12-22");
        personDTO.setShowOnCalendar(true);

        personDTO.addGoal("123");
        personDTO.addGoal("456");

        log.debug(personDTO.toString());

        personService.save(personDTO);


        return personDTO;
    }

    private PersonDTO buildPerson(){
        PersonDTO personDTO = new PersonDTO();
        personDTO.setFirstName("first name");
        personDTO.setLastName("last name");
        personDTO.setFirstNameRu("Привет");
        personDTO.setLastNameRu("ИМиши уишмууйж");

        return personDTO;
    }

    private PlayerDTO buildPlayer(){
        PlayerDTO personDTO = new PlayerDTO();
        personDTO.setFirstName("first name");
        personDTO.setLastName("last name");
        personDTO.setFirstNameRu("Привет player");
        personDTO.setLastNameRu("ИМиши уишмууйж");

        return personDTO;
    }
}
