package org.dauphine;

import org.example.CoffeeMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoffeeMachineFactoryTest {

    @Test
    public void testGetFullCoffeeMachine() {
        CoffeeMachine coffeeMachine = CoffeeMachineFactory.getFullCoffeeMachine();

        assertEquals(coffeeMachine.getMilk(), 10000);
        assertEquals(coffeeMachine.getWater(), 10000);
        assertEquals(coffeeMachine.getCoffeePowder(), 10000);
        assertEquals(coffeeMachine.getChocolatePowder(), 10000);
    }

}