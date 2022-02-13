package com.company;


public class Anime {
    private String name;
    private int marbles;
    private int age;

    public Anime(String name) {
        setAge();
        setMarbles();
        this.name=name;
    }

    // name
    public String getName() {
        return name;
    }


    //age
    public int getAge() {
        return age;
    }

    private void setAge() {
        int AgeVariant = (int) (java.lang.Math.random() * 100);
        age = AgeVariant;
    }

    // marbles Gagne (bonus)
    private void setMarbles() {
        int randomMarbles = (int) (java.lang.Math.random() * 10);
        randomMarbles += randomMarbles+1;
        this.marbles = randomMarbles;
    }

    //Perd (malus)
    public int getMarbles() {
        System.out.println("Marbles !!!!!! : ");
        return marbles;
    }

}
