package com.company;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class GameFight {
    private Joueur heroFigher;
    private ArrayList<Anime> animeList;
    private boolean winener;
    private boolean loser;


    public GameFight(GameStart f) {
        Scanner scanner = new Scanner(System.in);
        heroFigher = f.getHero();
        animeList = f.getAnimes();
        fight(scanner);
        if (winener)
            System.out.println("********** you win ************* \n" + "marbel : " + heroFigher.getMarbles() + "\n name winner is *******> " + heroFigher.getName());
        else if (loser)
            System.out.println("********** you lose ************* :");
    }

    private void fight(Scanner scanner) {

        while (true) {

            try {
                int i = 1;
                // for
                for (Anime a : animeList) {

                    System.out.println("""
                             *******************
                             commencer à deviner   : pair ou impair  ???????
                             *******************
                              
                                                    
                            votre animé est : ---->   """ + i++ + " ." + a.getName());

                    System.out.print("  Y pour pair , N pour impair :\n Taper (Y/N) pour valider --> ");

                    String n = scanner.nextLine().toUpperCase();
                    //******

                    if (n.equals("Y") || n.equals("N")) {

                        boolean casA = n.equals("Y") && a.getMarbles() % 2 == 0 || a.getAge() > 70;
                        boolean casB = n.equals("Y") && !(a.getMarbles() % 2 == 0) || a.getAge() > 70;
                        boolean casC = n.equals("n") && a.getMarbles() % 2 == 0 || a.getAge() > 70;
                        boolean casD = n.equals("n") && !(a.getMarbles() % 2 == 0) || a.getAge() > 70;
                        if (casA) {
                            System.out.print("Gagner ****** bonus ********");
                            heroFigher.setMarbles(a.getMarbles());
                        } else if (casB) {
                            heroFigher.setMarbles(a.getMarbles());
                            System.out.print("Gagner *** bonus ***  :  \n" + a.getMarbles() + "\n");
                            System.out.print(" *** votre Marble ***  :  \n" + heroFigher.getMarbles() + "\n");
                        } else if (casC) {
                            System.out.print("perdu !!!!!! Malus !!!!!!");
                            heroFigher.setMarbles(a.getMarbles());
                        } else if (casD) {
                            System.out.print("perdu !!!!!! Malus !!!!!!");
                            heroFigher.setMarbles(a.getMarbles());
                        } else {
                            System.out.println("no valid number choose good number !!!!!!!");

                        }
                    }
                    //******************************************************
                    winener = heroFigher.getMarbles() > 0;
                    loser = heroFigher.getMarbles() <= 0;

                }
                //**********
            } catch (InputMismatchException e) {
                System.out.println("no valid  choose good lettre : Y ou N !!!!!!!");

                continue;
            }

            break;
        }
        //*********


    }


    // *******
}
