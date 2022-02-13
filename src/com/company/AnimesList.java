package com.company;


public class AnimesList {
    private Anime animesList[] = new Anime[18];
    public AnimesList() {
        setAnimesList();
    }

    public Anime[] getAnimesList() {

        return animesList;
    }

    private void setAnimesList() {

        for (int i = 0; i < 6; i++) {
            animesList[i] = new Anime("Seong Gi-hun");
        }
        for (int i = 6; i < 12; i++) {
            animesList[i] = new Anime("Cho Sang-woo");
        }
        for (int i = 12; i < 18; i++) {
            animesList[i] = new Anime("Kang Sae-byeok");
        }

    }


}
