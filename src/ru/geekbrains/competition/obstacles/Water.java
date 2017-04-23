package ru.geekbrains.competition.obstacles;

import ru.geekbrains.competition.competitors.Competitor;

public class Water extends Obstacle {
    int distance;

    public Water(int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Competitor o) {
        o.swim(distance);
    }
}
