package org.dauphine;

public class SpaceShip {

    private int x;
    private int y;

    public SpaceShip() {
        this(0, 0);
    }

    public SpaceShip(int x, int y) {
        this.x = x;
        this.y = y;
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
        if(x == chicken.getX() && y < chicken.getY()) {
            chicken.setAlive(false);
        }
    }
}
