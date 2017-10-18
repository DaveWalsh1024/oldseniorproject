package com.example.david.scorecardpro;

import java.util.ArrayList;

/**
 * Created by david on 10/3/2017.
 */

public class Team
{
    public ArrayList getPlayers ()
    {
        return players;
    }

    public ArrayList getCoaches ()
    {
        return coaches;
    }

    public String getTeamName ()
    {
        return name;
    }

    public Season getCurrentSeason () {return currentSeason; }

    public void repOk()
    {
        assert players != null;
        assert coaches != null;
        assert name != null;
        assert currentSeason != null;
    }

    public Team (String name, int seasonWins, int seasonLosses, Season season)
    {
        this.players = new ArrayList<>();
        this.coaches = new ArrayList<>();
        this.disabledPlayerList = new ArrayList<>();
        this.name = name;
        this.currentSeason = currentSeason;
        repOk();
    }

    private ArrayList <Player> players;
    private ArrayList <Coach> coaches;
    private ArrayList <Player> disabledPlayerList;
    private String name;
    private Season currentSeason;
}
