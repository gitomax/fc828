package com.fc828.club.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.LinkedHashMap;
import java.util.Map;

@Data
@EqualsAndHashCode( callSuper = false)
public class PlayerDTO extends PersonDTO{

    private Map<Integer,String> scoredGoals = new LinkedHashMap<>(); // goals -> <goal, time>
    public void addGoal(String timeOfGoal){
        scoredGoals.put(scoredGoals.size()+1,timeOfGoal);
    }
}
