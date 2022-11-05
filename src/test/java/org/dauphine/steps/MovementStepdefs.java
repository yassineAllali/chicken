package org.dauphine.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.dauphine.SpaceShip;

import static org.junit.Assert.assertEquals;

public class MovementStepdefs {

    private SpaceShip spaceShip;

    @Given("spaceShip à la position \\({int}, {int}) [move]")
    public void createSpaceShipAtPosition(Integer x, Integer y) {
        spaceShip = new SpaceShip(x, y);
    }

    @When("le joueur déplace la Spaceship à gauche d'une distance {int}")
    public void moveLeft(int d) {
        spaceShip.moveLeft(d);
    }

    @When("le joueur déplace la Spaceship à droite d'une distance {int}")
    public void moveRight(int d) {
        spaceShip.moveRight(d);
    }

    @When("le joueur déplace la Spaceship en haut d'une distance {int}")
    public void moveUp(int d) {
        spaceShip.moveUp(d);
    }

    @When("le joueur déplace la Spaceship en bas d'une distance {int}")
    public void moveDown(int d) {
        spaceShip.moveDown(d);
    }

    @Then("la nouvelle position de la Spaceship devient \\({int}, {int}\\)")
    public void checkPosition(int x, int y) {
        assertEquals(x, spaceShip.getX());
        assertEquals(y, spaceShip.getY());
    }
}
