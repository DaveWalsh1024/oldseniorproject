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

    public void advanceRunners (int baseHitterWentTo, Player newBaseRunner)
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
            for (int i = 1; i < baseHitterWentTo + 1; i++)
            {
                if (baseHitterWentTo == 1)
                {
                     firstBase.setRunnerOnBase(newBaseRunner);
                }
            }
        }
    }

    public Field (Base firstBase, Base secondBase, Base thirdBase, Base homeBase)
    {
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
    }

    private Base firstBase;
    private Base secondBase;
    private Base thirdBase;
    private Base homeBase;
}
