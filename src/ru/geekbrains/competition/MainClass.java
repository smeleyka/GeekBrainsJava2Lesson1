package ru.geekbrains.competition;

import ru.geekbrains.competition.competitors.*;
import ru.geekbrains.competition.obstacles.*;

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
