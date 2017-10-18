package com.example.david.scorecardpro;

import java.util.ArrayList;

/**
 * Created by david on 10/17/2017.
 */

public class Season
{
    public int getWins () { return wins; }
    public int getLosses () { return losses; }

    public Season (int wins, int losses)
    {
        this.wins = wins;
        this.losses = losses;
        this.games = new ArrayList<>();
        repOk();
    }

    public void repOk()
    {
        assert wins > -1;
        assert losses > -1;
    }

    private int wins;
    private int losses;
    private ArrayList<Game> games;
}
