package com.example.david.scorecardpro;

import java.util.ArrayList;

/**
 * Created by david on 10/17/2017.
 */

public class AtBat {

    public int getStrikeCount () {
        return strikeCount;
    }

    public int getBallCount () {
        return ballCount;
    }

    public AtBat (int strikeCount, int ballCount) {
        this.strikeCount = strikeCount;
        this.ballCount = ballCount;
        this.pitches = new ArrayList<>();
        repOk();
    }

    public void repOk() {
        assert strikeCount > -1 && strikeCount < 4;
        assert ballCount > -1 && ballCount <  5;
    }

    private int strikeCount;
    private int ballCount;
    private ArrayList <Pitch> pitches;
}
