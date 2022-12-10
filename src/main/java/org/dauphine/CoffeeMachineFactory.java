package org.dauphine;

import org.example.CoffeeMachine;
import org.example.Machine;

public class CoffeeMachineFactory {

    public static CoffeeMachine getFullCoffeeMachine() {
        Machine machine = new Machine();
        return new CoffeeMachine(10000, 10000, 10000, 10000, machine);
    }
}
