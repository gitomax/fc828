package com.fc828.club.mapper;

import com.fc828.club.entity.Person;
import com.fc828.club.model.PersonDTO;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Locale;

@Component
public class PersonMapper {

    public Person getPerson(final PersonDTO personDTO){
        Person persona = new Person();

        persona.setFirstName(personDTO.getFirstName());
        persona.setLastName(personDTO.getLastName());
        persona.setFirstNameRu(personDTO.getFirstNameRu());
        persona.setLastNameRu(personDTO.getLastNameRu());
        persona.setShowOnCalendar(personDTO.isShowOnCalendar());
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd", Locale.ENGLISH);
            persona.setDateOfBirth(formatter.parse(personDTO.getDateOfBirth()));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        return persona;
    }


}
