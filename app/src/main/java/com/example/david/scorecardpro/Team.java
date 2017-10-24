package com.example.david.scorecardpro;

import java.util.ArrayList;

/**
 * Created by david on 10/3/2017.
 */

public class Team {

    public ArrayList getPlayers() {
        return players;
    }

    public ArrayList getCoaches() {
        return coaches;
    }

    public ArrayList getDisabledList() {
        return disabledList;
    }

    public String getTeamName() {
        return name;
    }

    public Season getCurrentSeason() {
        return currentSeason;
    }

    public void repOk() {
        assert players != null;
        assert coaches != null;
        assert name != null;
        assert currentSeason != null;
    }

    public Team (String name, Season currentSeason) {
        this.players = new ArrayList<>();
        this.coaches = new ArrayList<>();
        this.disabledList = new ArrayList<>();
        this.name = name;
        this.currentSeason = currentSeason;
        repOk();
    }

    public void addPlayer(Player newPlayer) {
        players.add(newPlayer);
        System.out.println("Player: " + newPlayer + "is added");
    }

    public void removePlayer(Player newPlayer) {
        players.remove(newPlayer);
        System.out.println("Player: " + newPlayer + "is removed");
    }

    public void addCoach(Coach newCoach) {
        coaches.add(newCoach);
        System.out.println("Coach: " + newCoach + "is added");
    }

    public void removeCoach(Coach newCoach) {
        coaches.remove(newCoach);
        System.out.println("Coach: " + newCoach + "is remove");
    }

    public void moveToDL(Player newPlayer) {
        disabledList.add(newPlayer);
        players.remove(newPlayer);
        System.out.println("Player: " + newPlayer + "was placed on the DL");
    }

    public void moveFromDL(Player newPlayer) {
        players.add(newPlayer);
        disabledList.remove(newPlayer);
        System.out.println("Player: " + newPlayer + "was activated from the DL");
    }

    private ArrayList <Player> players;
    private ArrayList <Coach> coaches;
    private ArrayList <Player> disabledList;
    private String name;
    private Season currentSeason;
}
