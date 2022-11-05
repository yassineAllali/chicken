package org.dauphine;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ChickenTest {

    @Test
    void testEggs() {
        Chicken chicken = new Chicken(5, 5);
        chicken.makeEgg();
        chicken.makeEgg();

        List<Egg> chickenEggs = chicken.getEggs();
        assertEquals(2, chickenEggs.size());
        for(Egg egg : chickenEggs) {
            assertEquals(chicken, egg.getChicken());
            checkPosition(5, 5, egg);
        }
    }

    private void checkPosition(double expectedX, double expectedY, Egg egg) {
        assertEquals(expectedX, egg.getX());
        assertEquals(expectedY, egg.getY());
    }
}
