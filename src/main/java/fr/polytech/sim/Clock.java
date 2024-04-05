package fr.polytech.sim;

import java.util.Random;

/**
 * A clock used to synchronize simulations.
 */
public class Clock {

    private static Clock clock = null;

    public static Clock getInstance() {
        if (clock == null) {
            clock = new Clock();
        }
        return clock;
    }
    private final int time = new Random().nextInt(25);

    /**
     * Random integer between 0 and 24 inclusive.
     */
    public int getTime() {
        return this.time;
    }
}
