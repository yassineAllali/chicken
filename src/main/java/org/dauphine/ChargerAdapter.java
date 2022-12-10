package org.dauphine;

import org.example.CoffeeMachine;
import org.example.Machine;

import java.util.Random;

public class ChargerAdapter implements Charger {

    private static final String HOT_CHOCOLATE = "Your hot chocolate is ready!";
    private static final String CAPPUCCINO = "Your cappuccino is ready !";
    private static final String EXPRESSO = "Your expresso is ready!";

    private final CoffeeMachine coffeeMachine;
    private DrinkType drinkType;

    public ChargerAdapter() {
        Machine machine = new Machine();
        coffeeMachine = new CoffeeMachine(5000, 5000, 5000, 5000, machine);
    }

    @Override
    public void charge(Chargeable chargeable) {
        String drink = getDrink();

        int energy = convertDrinkToEnergy(drink);
        int lastEnergy = chargeable.getEnergy();
        chargeable.setEnergy(lastEnergy + energy);
    }

    private int convertDrinkToEnergy(String coffee) {
        switch (coffee) {
            case HOT_CHOCOLATE:
                return 10;
            case CAPPUCCINO:
                return 15;
            case EXPRESSO:
                return 20;
            default:
                return 0;
        }
    }

    private String getDrink() {
        chooseDrink();

        switch (drinkType) {
            case EXPRESSO:
                return coffeeMachine.makeExpresso();
            case CAPPUCCINO:
                return coffeeMachine.makeCappuccino();
            default:
                return coffeeMachine.makeHotChocolate();
        }
    }

    private void chooseDrink() {
        Random r = new Random();
        int drinkIndex = r.nextInt(3);

        switch (drinkIndex) {
            case 1:
                drinkType = DrinkType.CAPPUCCINO;
                break;
            case 2:
                drinkType = DrinkType.EXPRESSO;
                break;
            default:
                drinkType = DrinkType.HOT_CHOCOLATE;
                break;
        }
    }

    private enum DrinkType {
        HOT_CHOCOLATE,
        CAPPUCCINO,
        EXPRESSO
    }
}
