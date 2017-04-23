package ru.geekbrains.competition.obstacles;

import ru.geekbrains.competition.competitors.Competitor;

public class Wall extends Obstacle {
    int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Competitor o) {
        o.jump(height);
    }
}
