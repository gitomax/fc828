package com.fc828.club.model;

import lombok.Data;

import java.util.List;

@Data
public class EventDTO {

    private long id;
    private String name; //
    private String eventType; // soccer game, p-club,
    private AddressDTO address; //
    private String eventPlace;
    private String eventUrlLocation; //
    private String description;
    private String eventDate; // date of the event
    private String eventTime; // time of the event
    private String eventDuration; //
    private String startRegistration; // datetime stamp when registration for the event will start
    private String endRegistration; // datetime stamp when registration for the event will end
    private int minParticipants = 2; //
    private int maxParticipants = -1; // unlimited
    private PersonDTO organizer;
    private List<PersonDTO> coOrganizers;

}
