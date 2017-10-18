package com.example.david.scorecardpro;

import java.text.FieldPosition;

/**
 * Created by david on 10/3/2017.
 */

public class Player
{

    public String getFName()
    {
        return fName;
    }

    public String getLName ()
    {
        return lName;
    }

    public String getPosition ()
    {
        return position;
    }

    public int getNumber ()
    {
        return number;
    }

    public int getAge () { return age; }

    public void repOk()
    {
        assert number > -1;
        assert age > -1;
    }

    public Player(String fName, String lName, String position, int number, int age)
    {
        this.fName = fName;
        this.lName = lName;
        this.position = position;
        this.number = number;
        this.age = age;
        repOk();
    }

    private String fName;
    private String lName;
    private String position;
    private int number;
    private int age;

}
