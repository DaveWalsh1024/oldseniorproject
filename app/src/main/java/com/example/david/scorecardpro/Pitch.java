package com.example.david.scorecardpro;

/**
 * Created by david on 10/17/2017.
 */

public enum Pitch
{
    STRIKE("Strike"),
    BALL("BALL"),
    HIT("HIT"),
    FOUL("FOUL"),
    HITBYPITCH("HITBYPITCH");

    private String stringValue;
    private Pitch(String toString)
    {
        stringValue = toString;
    }

    @Override
    public String toString()
    {
        return stringValue;
    }
}
