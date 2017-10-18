package com.example.david.scorecardpro;

import java.util.ArrayList;

/**
 * Created by david on 10/17/2017.
 */

public class HalfInning
{
    public Team getBattingTeam () { return battingTeam; }
    public Team getPitchingTeam () { return pitchingTeam; }
    public int getRunsScored () { return runsScored; }
    public int getOuts () { return outs; }

    public HalfInning (int outs, Team battingTeam, Team pitchingTeam, int runsScored)
    {
        this.batters = new ArrayList<>();
        this.outs = outs;
        this.battingTeam = battingTeam;
        this.pitchingTeam = pitchingTeam;
        this.runsScored = runsScored;
        repOk();
    }

    public void repOk()
    {
        assert outs > -1;
        assert runsScored > -1;
        assert battingTeam != null;
        assert pitchingTeam != null;
    }

    private ArrayList <AtBat> batters;
    private int outs;
    private Team battingTeam;
    private Team pitchingTeam;
    private int runsScored;
}
