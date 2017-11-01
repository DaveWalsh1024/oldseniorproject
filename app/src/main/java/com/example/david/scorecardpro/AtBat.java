package com.example.david.scorecardpro;

import java.util.ArrayList;

/**
 * Created by david on 10/17/2017.
 */

public class AtBat
{
    public int getStrikeCount () { return strikeCount; }
    public int getBallCount () { return ballCount; }
    public Field getField () { return field; }

    public void incrementStrikes ()
    {
        // If strike count is less than 3 add 1 to count
        if (strikeCount < 3)
            //Increment strikes by 1
            strikeCount++;

        // If strike count is already 2 then another strike is an out
        else
        {
            halfInning.incrementOuts();
        }
    }

    public void incrementBalls()
    {
        if (ballCount < 4)
            ballCount++;

        else
            field.advanceRunners(1, hitter);
    }

    public AtBat (Player hitter, HalfInning halfInning, int strikeCount, int ballCount, Field field)
    {
        this.hitter = hitter;
        this.halfInning = halfInning;
        this.strikeCount = strikeCount;
        this.ballCount = ballCount;
        this.pitches = new ArrayList<>();
        this.field = field;
        repOk();
    }

    public void repOk()
    {
        assert hitter != null;
        assert strikeCount > -1 && strikeCount < 4;
        assert ballCount > -1 && ballCount <  5;
    }

    Player hitter;
    HalfInning halfInning;
    private int strikeCount;
    private int ballCount;
    private ArrayList <Pitch> pitches;
    Field field;
}
