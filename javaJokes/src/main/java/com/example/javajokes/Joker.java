package com.example.javajokes;

import java.util.Random;

public class Joker {

    private static String[] jokes = {"Mom, where do tampons go?\n" + "Where the babies come from, darling.\n" +
            "In the stork?", "What is the difference between a snowman and a snowwoman?\n" +
            "Snowballs.", " My dog used to chase people on a bike a lot. It got so bad, finally I had to take his bike away."};

    public String getJoke() {
        return jokes[new Random().nextInt(jokes.length - 1)];
    }

}
