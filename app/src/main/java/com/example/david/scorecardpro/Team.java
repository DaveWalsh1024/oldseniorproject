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

    public void addPlayerToTeam (Player player)
    {
        players.add(player);
        repOk();
    }

    public void removePlayerFromTeam (Player player)
    {
        players.remove(player);
        repOk();
    }

    public void updateTeamName (String newTeamName)
    {
        name = newTeamName;
        repOk();
    }

    public void repOk()
    {
        assert players != null;
        assert coaches != null;
        assert name != null;
        assert currentSeason != null;
    }

    public Team (String name, Season currentSeason)
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
