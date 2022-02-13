package com.company;

public class Joueur {
    private String name;
    private int marbles;
    private int malus;
    private int bonus;

    public Joueur(String name, int marbles, int malus, int bonus) {

        this.name = name;
        this.marbles = marbles;
        this.malus = malus;
        this.bonus = bonus;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Gagne 1 bille en plus si une partie est gagnée ! (bonus)
    private void setMarbles() {

        System.out.println("bonus ****** : ");
        marbles += bonus;
    }

    //Perd 3 billes en plus si une partie est perdue ! (malus)
    public int getMarbles() {


        System.out.println("malus !!!!!! : ");
        return marbles -= malus;
    }


}

