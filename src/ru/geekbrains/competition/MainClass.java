package ru.geekbrains.competition;

import ru.geekbrains.competition.competitors.*;
import ru.geekbrains.competition.obstacles.*;

public class MainClass {
    public static void main(String[] args) {
       Team one = new Team("Зенит","Бобик",Type.DOG,"Мурзик",Type.CAT,"Барсик",Type.CAT,"Миша",Type.HUMAN);

       one.info();
       one.showResults();





    }
}
