package com.example.david.scorecardpro;

import java.util.Date;

/**
 * Created by david on 10/3/2017.
 */

public class Game {

    public Team getHomeTeam() {
        return homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public Date getGameDate() {
        return gameDate;
    }

    public String getLocation() {
        return location;
    }

    public int getHomeTeamScore() {
        return homeTeamScore;
    }

    public int getAwayTeamScore() {
        return awayTeamScore;
    }

    public Team getGameWinner() {
        if (homeTeamScore > awayTeamScore) {
            return homeTeam;
        }
        else
            return awayTeam;
    }


    public void repOk() {
        assert homeTeam != null;
        assert awayTeam != null;
        assert homeTeamScore > -1;
        assert awayTeamScore > -1;
    }

    public Game(Team homeTeam, Team awayTeam, Date gameDate, String location, int homeTeamScore, int awayTeamScore, Team gameWinner) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.gameDate = gameDate;
        this.location = location;
        this.homeTeamScore = homeTeamScore;
        this.awayTeamScore = awayTeamScore;
        this.gameWinner = gameWinner;
        repOk();
    }

    private Team homeTeam;
    private int homeTeamScore;
    private int awayTeamScore;
    private Team awayTeam;
    private Date gameDate;
    private String location;
    private Team gameWinner;
}
