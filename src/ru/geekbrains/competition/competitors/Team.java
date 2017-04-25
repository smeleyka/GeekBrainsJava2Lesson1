package ru.geekbrains.competition.competitors;


/**
 * Created by admin on 23.04.2017.
 */
public class Team {
    String teamName;
    Competitor[] competitors = new Competitor[4];
    public Team(String teamName,String firstCompetitor,Type firstType,String secondCompetitor,Type secondType,String thirdCompetitor,Type thirdType,String forthCompetitor,Type forthType) {
        this.teamName = teamName;
        competitors[0]= createCompititor(firstCompetitor,firstType);
        competitors[1]= createCompititor(secondCompetitor,secondType);
        competitors[2]= createCompititor(thirdCompetitor,thirdType);
        competitors[3]= createCompititor(forthCompetitor,forthType);
    }
    public Competitor createCompititor(String name,Type type){
        Competitor newCompetitor;
        if (type==Type.CAT) {
            newCompetitor = new Cat(name);
            return newCompetitor;
        }
        if (type==Type.DOG) {
            newCompetitor = new Dog(name);
            return newCompetitor;
        }
        if (type==Type.HUMAN) {
            newCompetitor = new Human(name);
            return newCompetitor;
        }
        return null;
    }
    public void info(){
        System.out.println("Команда "+teamName);
        for (Competitor c :competitors) c.info();
    }
    public void showResults(){
        for (Competitor c :competitors) {
            if (c.isOnDistance()) System.out.println(c.getName()+" прошел все испытания");
            else System.out.println(c.getName()+" не смог дойти до финиша");
        }
    }

    public Competitor[] getCompetitors() {
        return competitors;
    }
}
