package com.example.david.scorecardpro;

/**
 * Created by david on 11/27/2017.
 */

public class GameStats
{
    public int getStrikeouts () { return strikeouts; }
    public int getHomeruns () { return homeruns; }
    public int getWalks () { return walks; }
    public int getTimesAtBat () { return timesAtBat; }
    public Season getSeason () { return season; }
    public Game getGame () { return game; }

    public float getStrikeoutPercentage ()
    {
        float percentage = (strikeouts * 100.0f) / timesAtBat;
        return percentage;
    }

    public float getWalkPercentage ()
    {
        float percentage = (walks * 100.0f) / timesAtBat;
        return percentage;
    }

    public float getHomerunPercentage ()
    {
        float percentage = (homeruns * 100.0f) / timesAtBat;
        return percentage;
    }

    public void repOk()
    {
        assert strikeouts > -1;
        assert homeruns > -1;
        assert walks > -1;
        assert timesAtBat > -1;
        assert season != null;
        assert game != null;
    }

    public GameStats (int strikeouts, int homeruns, int walks, int timesAtBat, Season season, Game game)
    {
        this.strikeouts = strikeouts;
        this.homeruns = homeruns;
        this.walks = walks;
        this.timesAtBat = timesAtBat;
        this.season = season;
        this.game = game;
        repOk();
    }

    private int strikeouts;
    private int homeruns;
    private int walks;
    private int timesAtBat;
    private Season season;
    private Game game;
}