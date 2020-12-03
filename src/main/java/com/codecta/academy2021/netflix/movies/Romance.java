package com.codecta.academy2021.netflix.movies;

public class Romance implements Movie{

    @Override
    public String getName() {
        return "Romance";
    }

    @Override
    public String getDescription() {
        return "Romance films or romance movies are romantic love stories recorded in visual media for broadcast in theaters and " +
                "on TV that focus on passion, emotion, and the affectionate romantic involvement of the main characters and the journey that their love takes them through dating, courtship or marriage.";
    }
}
