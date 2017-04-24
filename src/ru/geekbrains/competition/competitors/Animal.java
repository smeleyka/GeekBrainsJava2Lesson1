package ru.geekbrains.competition.competitors;

public abstract class Animal implements Competitor{
    String name;
    String type;
    int maxRunDistance;
    int maxSwimDistance;
    int maxJumpHeight;
    boolean onDistance;

    public String getName() {
        return name;
    }

    public void info() {
        System.out.println(name+" "+type);
    }

    public boolean isOnDistance() {
        return onDistance;
    }

    public Animal(String name, String type, int maxRunDistance, int maxSwimDistance, int maxJumpHeight) {
        this.name = name;
        this.type = type;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.onDistance = true;
    }

    public void run(int dist) {
        if(dist <= maxRunDistance) {
            System.out.println(type + " " + name + " успешно справился с кроссом");
        } else {
            System.out.println(type + " " + name + " не смог преодолет кросс");
            onDistance = false;
        }
    }

    public void jump(int height) {
        if(height <= maxJumpHeight) {
            System.out.println(type + " " + name + " успешно перепрыгнул препятствие");
        } else {
            System.out.println(type + " " + name + " не смог перепрыгнуть препятствие");
            onDistance = false;
        }
    }

    public void swim(int distance) {
        if(distance <= maxSwimDistance) {
            System.out.println(type + " " + name + " успешно проплыл дистанцию");
        } else {
            System.out.println(type + " " + name + " не смог проплыть дистанцию");
            onDistance = false;
        }
    }
}
