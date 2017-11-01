package com.example.david.scorecardpro;

/**
 * Created by david on 11/1/2017.
 */

public class Field
{
    public void setBaseRunner (int baseNumber, Player player)
    {
        if (baseNumber == 1)
        {
            firstBase.setRunnerOnBase(player);
        }

        else if (baseNumber == 2)
        {
            secondBase.setRunnerOnBase(player);
        }

        else
        {
            thirdBase.setRunnerOnBase(player);
        }
    }

    public boolean checkIfBaseHasRunner (int baseNumber)
    {
        if (baseNumber == 1 && firstBase.getRunnerOnBase() == null)
        {
            return false;
        }
        else if (baseNumber == 2 && secondBase.getRunnerOnBase() == null)
        {
            return false;
        }
        else if (baseNumber == 3 && thirdBase.getRunnerOnBase() == null)
        {
            return false;
        }

        else
            return true;
    }

    public Base getNextBase (Base base)
    {
        if (base.getBaseNumber() == 1)
        {
            return secondBase;
        }

        else if (base.getBaseNumber() == 2)
        {
            return thirdBase;
        }

        else
        {
            return homeBase;
        }
    }

    public void forcedBase (Player newBaseRunner)
    {
        boolean firstBaseHasRunner = false;
        boolean secondBaseHasRunner = false;
        boolean thirdBaseHasRunner = false;

        if (firstBase.getRunnerOnBase() != null)
        {
            firstBaseHasRunner = true;
        }

        if (secondBase.getRunnerOnBase() != null)
        {
            secondBaseHasRunner = true;
        }

        if (thirdBase.getRunnerOnBase() != null)
        {
            thirdBaseHasRunner = true;
        }

        if (firstBaseHasRunner == false && secondBaseHasRunner == false && thirdBaseHasRunner == false)
        {
            firstBase.setRunnerOnBase(newBaseRunner);
        }

        if (firstBaseHasRunner == true && secondBaseHasRunner == false && thirdBaseHasRunner == false)
        {
            secondBase.setRunnerOnBase(firstBase.getRunnerOnBase());
            firstBase.removeRunnerOnBase();
            firstBase.setRunnerOnBase(newBaseRunner);
        }

        if (firstBaseHasRunner == true && secondBaseHasRunner == true && thirdBaseHasRunner == false)
        {
            thirdBase.setRunnerOnBase(secondBase.getRunnerOnBase());
            secondBase.removeRunnerOnBase();
            secondBase.setRunnerOnBase(firstBase.getRunnerOnBase());
            firstBase.removeRunnerOnBase();
            firstBase.setRunnerOnBase(newBaseRunner);
        }

        if (firstBaseHasRunner == true && secondBaseHasRunner == true && thirdBaseHasRunner == true)
        {
            halfInning.incrementRunsScored();
            thirdBase.removeRunnerOnBase();
            thirdBase.setRunnerOnBase(secondBase.getRunnerOnBase());
            secondBase.removeRunnerOnBase();
            secondBase.setRunnerOnBase(firstBase.getRunnerOnBase());
            firstBase.removeRunnerOnBase();
            firstBase.setRunnerOnBase(newBaseRunner);
        }
    }

    public void extraBase(int basesAdvanced, Base basePlayerStartedOn, Player newBaseRunner)
    {
        int newBaseNumber = basePlayerStartedOn.getBaseNumber() + basesAdvanced;

        if (newBaseNumber == 1)
        {
            firstBase.setRunnerOnBase(newBaseRunner);
        }

        else if (newBaseNumber == 2)
        {
            secondBase.setRunnerOnBase(newBaseRunner);
        }

        else if (newBaseNumber == 3)
        {
            thirdBase.setRunnerOnBase(newBaseRunner);
        }

        else
            halfInning.incrementRunsScored();
    }

    public Field (Base firstBase, Base secondBase, Base thirdBase, Base homeBase, HalfInning halfInning, Team battingTeam, Team fieldingTeam)
    {
        this.battingTeam = battingTeam;
        this.fieldingTeam = fieldingTeam;
        this.halfInning = halfInning;
        this.firstBase = firstBase;
        this.secondBase = secondBase;;
        this.thirdBase = thirdBase;
        this.homeBase = homeBase;
        repOk();
    }

    public void repOk()
    {
        assert firstBase != null;
        assert secondBase != null;
        assert thirdBase != null;
        assert homeBase != null;
        assert battingTeam != null;
        assert fieldingTeam != null;
    }

    private HalfInning halfInning;
    private Team battingTeam;
    private Team fieldingTeam;
    private Base firstBase;
    private Base secondBase;
    private Base thirdBase;
    private Base homeBase;
}
