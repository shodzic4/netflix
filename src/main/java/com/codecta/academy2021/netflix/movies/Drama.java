package com.codecta.academy2021.netflix.movies;

public class Drama implements Movie {
    @Override
    public String getName() {
        return "Drama";
    }
    @Override
    public String getDescription() {
        return "In film and television, drama is a category of narrative fiction (or semi-fiction) intended to be more serious than" +
                " humorous in tone.";
    }
}
