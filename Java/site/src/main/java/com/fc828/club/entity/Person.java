package com.fc828.club.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "first_name_ru")
    private String firstNameRu;

    @Column(name = "last_name_ru")
    private String lastNameRu;

    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    @Column(name = "show_on_calendar")
    private boolean showOnCalendar;

    @Column(name = "created_on")
    private Date createdOn;

}