package ru.geekbrains.competition.obstacles;


import ru.geekbrains.competition.competitors.Competitor;
import ru.geekbrains.competition.competitors.Team;

/**
 * Created by admin on 24.04.2017.
 */
public class Course {
    Obstacle[] obstacles;
    //Есть способ сделать такую запись более универсальной?
    //Т.е в зависимости от того сколько параметров будет передано, такой массив и получим.
    public Course(ObType obType1,int ob1) {
        obstacles = new Obstacle[1];
        obstacles[0] = createObstacle(obType1, ob1);
    }

    public Course(ObType obType1,int ob1,ObType obType2,int ob2) {
        obstacles = new Obstacle[2];
        obstacles[0] = createObstacle(obType1, ob1);
        obstacles[1] = createObstacle(obType2, ob2);
    }

    public Course(ObType obType1,int ob1,ObType obType2,int ob2,ObType obType3,int ob3) {
        obstacles = new Obstacle[3];
        obstacles[0] = createObstacle(obType1, ob1);
        obstacles[1] = createObstacle(obType2, ob2);
        obstacles[2] = createObstacle(obType3, ob3);
    }

    public Course(ObType obType1,int ob1,ObType obType2,int ob2,ObType obType3,int ob3,ObType obType4,int ob4) {
        obstacles = new Obstacle[4];
        obstacles[0] = createObstacle(obType1, ob1);
        obstacles[1] = createObstacle(obType2, ob2);
        obstacles[2] = createObstacle(obType3, ob3);
        obstacles[3] = createObstacle(obType4, ob4);
    }

    public Course(ObType obType1,int ob1,ObType obType2,int ob2,ObType obType3,int ob3,ObType obType4,int ob4,ObType obType5,int ob5) {
        obstacles = new Obstacle[5];
        obstacles[0] = createObstacle(obType1, ob1);
        obstacles[1] = createObstacle(obType2, ob2);
        obstacles[2] = createObstacle(obType3, ob3);
        obstacles[3] = createObstacle(obType4, ob4);
        obstacles[4] = createObstacle(obType5, ob5);
    }

    public Obstacle createObstacle(ObType type,int dist){
        Obstacle o;
        if (type == ObType.WALL) {
            o = new Wall(dist);
            return o;
        }
        if (type == ObType.CROSS) {
            o = new Cross(dist);
            return o;
        }
        if (type == ObType.WATER) {
            o = new Water(dist);
            return o;
        }
        return null;
    }
    public void doIt(Team t){
        for (Competitor c : t.getCompetitors()) {
            for (Obstacle o : obstacles) {
                o.doIt(c);
                if (!c.isOnDistance()) break;
            }
        }
    }
}