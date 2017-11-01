package com.example.david.scorecardpro;

/**
 * Created by jacklavallee on 10/18/17.
 */

public class Main {

    public static void main(String[] args) {
        Player jack = new Player("Jack", "Lavallee", 6, 3, 23);
        Player david = new Player("David", "Walsh", 4, 2, 21);
        Player joe = new Player("Joe", "Russell", 1, 51, 34);

        Coach craig = new Coach("Craig", "Damon", "Manager");

        Season season1 = new Season(0, 0);

        Team goodGuys = new Team("Red Sox", season1);
    }

}
