package com.fc828.club.model;

import lombok.Data;

import java.util.List;

@Data
public class TeamDTO {

    private String teamName;
    private List<PlayerDTO> players;

}
