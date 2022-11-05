package org.dauphine;

public class Egg {
    private double x;
    private double y;
    private Chicken chicken;

    public Egg(double x, double y, Chicken chicken) {
        this.x = x;
        this.y = y;
        this.chicken = chicken;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Chicken getChicken() {
        return chicken;
    }
}
