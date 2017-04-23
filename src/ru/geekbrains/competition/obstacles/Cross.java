package ru.geekbrains.competition.obstacles;

import ru.geekbrains.competition.competitors.Competitor;

public class Cross extends Obstacle {
    int length;

    public Cross(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Competitor o) {
        o.run(length);
    }
}
