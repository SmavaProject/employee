package com.example.team;

import java.io.Serializable;
import java.util.Objects;

public class TeamMembersId implements Serializable {

    private String teamId;
    private String userId;

    public TeamMembersId(){
    }

    public TeamMembersId(String teamId, String userId){
        this.teamId = teamId;
        this.userId = userId;
    }

    @Override
    public boolean equals (Object o){
        return true;
    }

    @Override
    public int hashCode(){
        return Objects.hash(teamId, userId);
    }
}
