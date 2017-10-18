package com.example.david.scorecardpro;

import java.util.ArrayList;

/**
 * Created by david on 10/17/2017.
 */

public class Inning
{
    public int getInningCount () { return inningCount; }

    public Inning (int inningCount)
    {
        this.inningCount = inningCount;
        this.halfInnings = new ArrayList<>();
        repOk();
    }

    public void repOk()
    {
        assert inningCount > 0;
    }

    private ArrayList <HalfInning> halfInnings;
    private int inningCount;
}
