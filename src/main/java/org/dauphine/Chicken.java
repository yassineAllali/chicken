package org.dauphine;

import java.util.ArrayList;
import java.util.List;

public class Chicken {
    private int x;
    private int y;
    private boolean alive;
    private List<Egg> eggs;

    public Chicken(int x, int y) {
        this.x = x;
        this.y = y;
        this.eggs = new ArrayList<>();
        alive = true;
    }

    public Chicken() {
        this(0, 0);
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

    public List<Egg> getEggs() {
        return eggs;
    }

    public void makeEgg() {
        eggs.add(new Egg(x, y, this));
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public void setEggs(List<Egg> eggs) {
        this.eggs = eggs;
    }
}
