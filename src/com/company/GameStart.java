package com.company;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GameStart {

    private ArrayList<Anime> animes = new ArrayList<>();
    private Joueur hero;

    public Joueur getHero() {
        return hero;
    }

    public ArrayList<Anime> getAnimes() {
        return animes;
    }

    //game start here
    public GameStart() {
        Scanner scanner = new Scanner(System.in);
        chooseDifficulty(scanner);
        chooseHero(scanner);

    }

    //chooseDifficulty
    private void chooseDifficulty(Scanner scanner) {
        int level;

        while (true) {

            try {
                System.out.println("""
                        choisir la deficulté :
                        1. Facile : 4 niveaux
                        2. Difficile : 12 niveaux
                        3. Impossible : 18 niveaux""");

                System.out.print("taper la numero de defficulté :");
                int n = scanner.nextInt();

                if (n > 0 && n < 4) {
                    level = n;
                    switch (level) {
                        case 1:
                            difficulty(4);
                            break;
                        case 2:
                            difficulty(12);
                            break;
                        case 3:
                            difficulty(18);
                            break;
                    }
                } else {
                    System.out.println("no no valid number choose good number !!!!!!!");
                    continue;
                }
            } catch (InputMismatchException e) {
                System.out.println("no valid number choose good number !!!!!!!");
                scanner.nextInt();
                continue;
            }

            break;
        }
        //*********
    }

    // difficulty&& choose anime
    private void difficulty(int dificult) {

        AnimesList anime = new AnimesList();
        int i = 0;
        do {

            int randomAnime = (int) (java.lang.Math.random() * 10);
            randomAnime += randomAnime;
            if (randomAnime < 18 && randomAnime > 0) {
                //si il n y pas dans cette anime dans le list
                if (!animes.contains(anime.getAnimesList()[randomAnime])) {
                    animes.add(anime.getAnimesList()[randomAnime]);
                    i++;
                }

            } else
                continue;

        } while (i < dificult);
    }

    // choose hero
    private void chooseHero(Scanner scanner) {
        int heroId;
        JoueursList joueur = new JoueursList();


        while (true) {

            try {
                System.out.println("""
                        *******************
                        Choisir  Hero :
                        *******************
                        1.  Seong Gi-hun
                        2. Kang Sae-byeok
                        3. Cho Sang-woo""");

                System.out.print("taper la numero de Hero :");
                int n = scanner.nextInt();

                if (n > 0 && n < 4) {
                    heroId = n;
                    switch (heroId) {
                        case 1:
                            hero = joueur.joueurs[1];
                            break;
                        case 2:
                            hero = joueur.joueurs[2];
                            break;
                        case 3:
                            hero = joueur.joueurs[3];
                            break;
                    }
                } else {
                    System.out.println(" no valid number choose good number !!!!!!!");
                    continue;
                }
            } catch (InputMismatchException e) {
                System.out.println("no valid number choose good number !!!!!!!");
                scanner.nextInt();
                continue;
            }

            break;
        }
        //*********
    }
    // class '}'
}
