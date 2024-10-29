package com.fc828.club.model;

import lombok.Data;

import java.util.List;

@Data
public class SoccerGameDTO {

    private TeamDTO homeTeam;
    private TeamDTO visitorsTeam;
    private int homeScore = 0;
    private int visitorsScore = 0;
    private String gameDate;
    private String gameTime;
    private String gamePlace;
    private List<PlayerDTO> homeTeamScorers;
    private List<PlayerDTO> visitorsTeamScorers;

}
