package com.codecta.academy2021.netflix.movies;

public class Comedy implements  Movie {
    @Override
    public String getName() {
        return "Comedy";
    }
    @Override
    public String getDescription() {
        return "A comedy film is a category of film in which the main emphasis is on humor. " +
                "These films are designed to make the audience laugh through amusement and most often work by exaggerating characteristics for humorous effect";
    }
}
