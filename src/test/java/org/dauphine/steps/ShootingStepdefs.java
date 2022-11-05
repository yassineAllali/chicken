package org.dauphine.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.dauphine.Chicken;
import org.dauphine.SpaceShip;

import static org.junit.Assert.*;

public class ShootingStepdefs {

    private SpaceShip spaceShip;
    private Chicken chicken;

    @Given("spaceShip à la position \\({int}, {int}) [shoot]")
    public void initializeSpaceship(int x, int y) {
        spaceShip = new SpaceShip(x, y);
    }

    @Given("Chicken à la position \\({int}, {int})")
    public void initializeChicken(int x, int y) {
        chicken = new Chicken(x, y);
    }

    @When("le joueur lance la boule de feu")
    public void shoot() {
        spaceShip.shoot(chicken);
    }
    @Then("Chicken est dead")
    public void chickenIsDead() {
        assertFalse(chicken.isAlive());
    }

    @Then("Chicken est toujours alive")
    public void chickenStillAlive() {
        assertTrue(chicken.isAlive());
    }
}
