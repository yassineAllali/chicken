package org.dauphine;

public class SpaceShip implements Chargeable{

    private int x;
    private int y;
    private int energy;

    public SpaceShip() {
        this(0, 0);
    }

    public SpaceShip(int x, int y) {
        this(x, y, 0);
    }

    public SpaceShip(int x, int y, int energy) {
        this.x = x;
        this.y = y;
        this.energy = energy;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void moveLeft(int d) {
        this.x -= d;
    }

    public void moveRight(int d) {
        this.x += d;
    }

    public void moveUp(int d) {
        this.y += d;
    }

    public void moveDown(int d) {
        this.y -= d;
    }

    public void shoot(Chicken chicken) {
        if(energy > 0) {
            if(x == chicken.getX() && y < chicken.getY()) {
                chicken.setAlive(false);
            }
            energy--;
        }
    }

    @Override
    public void setEnergy(int energy) {
        this.energy = energy;
    }

    @Override
    public int getEnergy() {
        return energy;
    }
}
