package com.fc828.club.service;

import com.fc828.club.entity.Person;
import com.fc828.club.mapper.PersonMapper;
import com.fc828.club.model.PersonDTO;
import com.fc828.club.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;
    private final PersonMapper personMapper;

    public Person save(PersonDTO personDTO){

        Person person = personMapper.getPerson(personDTO);
        return personRepository.save(person);
    }
}
