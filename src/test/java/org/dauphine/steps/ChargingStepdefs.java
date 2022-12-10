package org.dauphine.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.dauphine.Chargeable;
import org.dauphine.Charger;
import org.dauphine.ChargerAdapter;
import org.dauphine.SpaceShip;

import static org.junit.Assert.*;

public class ChargingStepdefs {

    private Chargeable chargeable;
    private Charger charger;

    @Given("chargeable avec le niveau d'energy {int}")
    public void initChargeable(int energy) {
        chargeable = new SpaceShip();
        chargeable.setEnergy(energy);
    }

    @When("l'utilisateur charge le chargeable avec le ChargerAdapter")
    public void charge() {
        charger = new ChargerAdapter();
        charger.charge(chargeable);
    }

    @Then("chargeable a le nouveau niveau d'energy supérieur à {int}")
    public void chargeableEnergyLevelMustBeHigher(int energy) {
        assertTrue(chargeable.getEnergy() > energy);
    }
}
