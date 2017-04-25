package ru.geekbrains.competition.competitors;

public interface Competitor{
    void info();
    String getName();
    boolean isOnDistance();
    void run(int dist);
    void jump(int height);
    void swim(int distance);
}
