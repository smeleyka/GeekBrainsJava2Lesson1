package ru.geekbrains.competition.competitors;

public class Human implements Competitor {
    String name;
    int maxRunDistance;
    int maxSwimDistance;
    int maxJumpHeight;
    boolean active;

    public String getName() {
        return name;
    }

    public void info() {
        System.out.println(name+" "+maxJumpHeight);
    }

    @Override
    public boolean isOnDistance() {
        return active;
    }

    public Human(String name) {
        this.name = name;
        this.maxRunDistance = 8000;
        this.maxSwimDistance = 1000;
        this.maxJumpHeight = 20;
        this.active = true;
    }

    public void run(int dist) {
        if(dist <= maxRunDistance) {
            System.out.println(name + " успешно справился с кроссом");
        } else {
            System.out.println(name + " не смог преодолет кросс");
            active = false;
        }
    }

    public void jump(int height) {
        if(height <= maxJumpHeight) {
            System.out.println(name + " успешно перепрыгнул препятствие");
        } else {
            System.out.println(name + " не смог перепрыгнуть препятствие");
            active = false;
        }
    }

    public void swim(int distance) {
        if(distance <= maxSwimDistance) {
            System.out.println(name + " успешно проплыл дистанцию");
        } else {
            System.out.println(name + " не смог проплыть дистанцию");
            active = false;
        }
    }
}
