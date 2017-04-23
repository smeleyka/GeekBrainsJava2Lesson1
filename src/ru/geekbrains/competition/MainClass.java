package ru.geekbrains.competition;

import ru.geekbrains.competition.competitors.Cat;
import ru.geekbrains.competition.competitors.Competitor;
import ru.geekbrains.competition.competitors.Dog;
import ru.geekbrains.competition.competitors.Human;
import ru.geekbrains.competition.obstacles.Cross;
import ru.geekbrains.competition.obstacles.Obstacle;
import ru.geekbrains.competition.obstacles.Wall;
import ru.geekbrains.competition.obstacles.Water;

public class MainClass {
    public static void main(String[] args) {
        Competitor[] competitors = {new Cat("Barsik"), new Dog("Bobik"), new Human("Bob")};
        Obstacle[] obstacles = {new Cross(500), new Wall(3), new Water(5), new Cross(200)};

        for (Competitor c : competitors) {
            for (Obstacle o : obstacles) {
                o.doIt(c);
                if(!c.isOnDistance()) break;
            }
        }

        for (Competitor c : competitors) {
            if(c.isOnDistance()) {
                System.out.println(c.getName() + " - прошел дистанцию");
            } else {
                System.out.println(c.getName() + " - не прошел дистанцию");
            }
        }
        competitors[1].info();
    }
}
