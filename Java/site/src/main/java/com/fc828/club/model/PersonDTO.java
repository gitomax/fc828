package com.fc828.club.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class PersonDTO {

    private long id;
    private String firstName;
    private String lastName;
    private String firstNameRu;
    private String lastNameRu;
    private String dateOfBirth;
    private boolean showOnCalendar;
    private String createdOn;

    private List<AddressDTO> addressList = new ArrayList<>();
    private ContactDTO contact;

}
